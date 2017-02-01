void setup()
{
pinMode(13,OUTPUT);
Serial.begin(9600);
Serial.println("START");
}

void loop()
{
if(Serial.available()>0)
{
char x = Serial.read();
if(x=='A' || x=='a')
{
Serial.println("LED HIGH");
digitalWrite(13,HIGH);
}else if(x=='B' || x=='b')
{
Serial.println("LED LOW");
digitalWrite(13,LOW);
}
}
}
