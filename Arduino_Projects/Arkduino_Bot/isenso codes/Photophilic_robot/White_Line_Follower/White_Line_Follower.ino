void setup()
{
pinMode(10,OUTPUT);
pinMode(11,OUTPUT);
pinMode(12,OUTPUT);
pinMode(13,OUTPUT);
pinMode(3,INPUT);           //LEFT SENSOR
pinMode(4,INPUT);           //RIGHT SENSOR
}

void loop()
{
int l = digitalRead(3);
int r = digitalRead(4);

if(l==LOW && r==LOW)
{
digitalWrite(10,HIGH);
digitalWrite(11,LOW);
digitalWrite(12,HIGH);
digitalWrite(13,LOW);
}
else if(l==HIGH && r==LOW)
{
digitalWrite(10,LOW);
digitalWrite(11,LOW);
digitalWrite(12,HIGH);
digitalWrite(13,LOW);
}
else if(l==LOW && r==HIGH)
{
digitalWrite(10,HIGH);
digitalWrite(11,LOW);
digitalWrite(12,LOW);
digitalWrite(13,LOW);
}
else
{
digitalWrite(10,LOW);
digitalWrite(11,LOW);
digitalWrite(12,LOW);
digitalWrite(13,LOW);
}
}
