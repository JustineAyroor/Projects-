
// these constants won't change:
const int xPin = A0;		// X output of the accelerometer
const int yPin = A1;		// Y output of the accelerometer
const int zPin = A2;    // Z output of the accelerometer
int xr,yr,zr;
void setup() {
  // initialize serial communications:
  Serial.begin(9600);
  
  // initialize the pins connected to the accelerometer
  pinMode(xPin, INPUT);
  pinMode(yPin, INPUT);
  pinMode(zPin, INPUT);
}

void loop() {
 
  // variables to contain the resulting accelerations
 // int accelerationX, accelerationY, accelerationZ;
  
  
  xr = analogRead(xPin);
  yr = analogRead(yPin);
  zr = analogRead(zPin);
  // mapping into degrees
  
  // send the accelerometer data to Processing through serial connection
  Serial.print(xr);
  Serial.print(",");
  Serial.print(yr);
  Serial.print(",");
  Serial.print(zr);
  Serial.print("\n");
  
  // delay the loop so we're sending a manageable amount of data
  delay(1000);
}
