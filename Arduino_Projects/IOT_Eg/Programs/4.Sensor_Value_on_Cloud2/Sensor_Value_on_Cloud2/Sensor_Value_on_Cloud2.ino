
#include <SoftwareSerial.h>
#include <stdlib.h>

// replace with your channel's thingspeak API key
String apiKey = "9JFR76M76N504IIV";


SoftwareSerial ser(2, 3); // RX, TX

int i=1;


// this runs once
void setup() {                
  // initialize the sensors at 6th,A0 and A1 pins as an input.
  pinMode(6,INPUT);//LDR Sensor
  pinMode(A0,INPUT);//Potentiometer
  pinMode(A1,INPUT); //Temperature Sensor LM35

  
  // enable debug serial
  Serial.begin(9600); 
  // enable software serial
  ser.begin(9600);
  
  // reset ESP8266
  ser.println("AT+RST");
}


// the loop 
void loop() {
  
  //reading the state of sensor1
  int lightsensor = digitalRead(6);         //LDR Sensor
  int potentiometer = analogRead(A0);       //Potentiometer
  int temp = analogRead(A1);  //Temperature Sensor LM35
  
  //Temperature Sensor  And  Conversion
  float mv = ( temp/1024.0)*5000; 
  float cel = mv/10;
  
  String state1=String(lightsensor);
   
  String state2=String(potentiometer);
  
  String state3=String(cel);
  
  
    
  // TCP connection
  String cmd = "AT+CIPSTART=\"TCP\",\"";
  cmd += "184.106.153.149"; // api.thingspeak.com
  cmd += "\",80";
  ser.println(cmd);
  Serial.println(cmd);
   
  if(ser.find("Error")){
    Serial.println("AT+CIPSTART error");
    return;
  }
  
  // prepare GET string
  String getStr = "GET /update?api_key=";
  getStr += apiKey;
 
  getStr +="&field1=";
  getStr += String(state1);
  getStr +="&field2=";
  getStr += String(state2);
  getStr +="&field3=";
  getStr += String(state3);
  getStr += "\r\n\r\n";

  // send data length
  cmd = "AT+CIPSEND=";
  cmd += String(getStr.length());
  ser.println(cmd);
  Serial.println(cmd);

  if(ser.find(">")){
    ser.print(getStr);
    Serial.print(getStr);
  }
  else{
    ser.println("AT+CIPCLOSE");
    // alert user
    Serial.println("AT+CIPCLOSE");
  }
    
  // thingspeak needs 15 sec delay between updates
  delay(15000);  
}
