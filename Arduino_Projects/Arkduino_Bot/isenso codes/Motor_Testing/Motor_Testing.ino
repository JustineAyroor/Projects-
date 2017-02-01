void setup()
{
pinMode(10,OUTPUT);
pinMode(11,OUTPUT);
pinMode(12,OUTPUT);
pinMode(13,OUTPUT);

digitalWrite(10,HIGH);          //FORWARD
digitalWrite(11,LOW);
digitalWrite(12,HIGH);
digitalWrite(13,LOW);
delay(2000);

digitalWrite(10,LOW);          //BACKWARD
digitalWrite(11,HIGH);
digitalWrite(12,LOW);
digitalWrite(13,HIGH);
delay(2000);

digitalWrite(10,LOW);          //LEFT
digitalWrite(11,HIGH);
digitalWrite(12,HIGH);
digitalWrite(13,LOW);
delay(1000);

digitalWrite(10,HIGH);       //RIGHT
digitalWrite(11,LOW);
digitalWrite(12,LOW);
digitalWrite(13,HIGH);
delay(1000);

digitalWrite(10,HIGH);      //STOP
digitalWrite(11,HIGH);
digitalWrite(12,HIGH);
digitalWrite(13,HIGH);
delay(5000);
}

void loop()
{

}
