
// these constants won't change:
const int xPin = A0;		// X output of the accelerometer
const int yPin = A1;		// Y output of the accelerometer
const int zPin = A2;    // Z output of the accelerometer
int xr,yr,zr;
void setup() {
  // initialize serial communications:
  //Serial.begin(9600);
  
  // initialize the pins connected to the accelerometer
  pinMode(xPin, INPUT);
  pinMode(yPin, INPUT);
  pinMode(zPin, INPUT);
   pinMode(10, OUTPUT);
  pinMode(11, OUTPUT);
  pinMode(12, OUTPUT);
   pinMode(13, OUTPUT);
}

void loop() {
 
  // variables to contain the resulting acceleratio
  
  
  xr = analogRead(xPin);
  yr = analogRead(yPin);
  zr = analogRead(zPin);
  // mapping into degrees
  
  // send the accelerometer data to Processing through serial connection
/*  Serial.print(xr);
  Serial.print(",");
  Serial.print(yr);
  Serial.print(",");
  Serial.print(zr);
  Serial.print("\n");
*/  
  // delay the loop so we're sending a manageable amount of data

  
  
  if(((xr>355) && (xr<370))  &&  ((yr>354) && (yr<370)))
  
  {
   digitalWrite ( 10,HIGH);
   digitalWrite ( 11,HIGH);
   digitalWrite ( 12,HIGH);
   digitalWrite ( 13,HIGH);
  }
  
  else if(((xr>345) && (xr<370))  &&  ((yr>290) && (yr<315)))
   
   {
     
     digitalWrite ( 10,HIGH);
   digitalWrite ( 11,LOW);
   digitalWrite ( 12,HIGH);
   digitalWrite ( 13,LOW);
   }
  
 else if(((xr>345) && (xr<360))  &&  ((yr>390) && (yr<415)))
  
  {
   digitalWrite ( 10,LOW);
   digitalWrite ( 11,HIGH);
   digitalWrite ( 12,LOW);
   digitalWrite ( 13,HIGH);
  }
  
  else if(((xr>290) && (xr<315))  &&  ((yr>345) && (yr<360)))
   
   {
     
     digitalWrite ( 10,HIGH);
   digitalWrite ( 11,LOW);
   digitalWrite ( 12,LOW);
   digitalWrite ( 13,HIGH);
   }
    
    else if(((xr>385) && (xr<410))  &&  ((yr>345) && (yr<360)))
   
   { 
     digitalWrite ( 10,LOW);
   digitalWrite ( 11,HIGH);
   digitalWrite ( 12,HIGH);
   digitalWrite ( 13,LOW);
   }
    
    
    }
