void setup()
{
pinMode(13,OUTPUT);
pinMode(3,INPUT);
}

void loop()
{
int s = digitalRead(3);
if(s == HIGH)
{
digitalWrite(13,HIGH);
}
if(s==LOW)
{
digitalWrite(13,LOW);
}
}
