void setup()
{
pinMode(10,OUTPUT);
pinMode(11,OUTPUT);
pinMode(12,OUTPUT);
pinMode(13,OUTPUT);
pinMode(3,INPUT);
pinMode(4,INPUT);
}

void loop()
{
int l = digitalRead(4);
int r = digitalRead(3);

if(l==HIGH && r==HIGH)
{
digitalWrite(11,LOW);
digitalWrite(10,HIGH);
digitalWrite(13,LOW);
digitalWrite(12,HIGH);
}
else if(l==LOW && r==HIGH)
{
digitalWrite(10,HIGH);
digitalWrite(11,LOW);
digitalWrite(13,HIGH);
digitalWrite(12,LOW);
}
else if(l==HIGH && r==LOW)
{
digitalWrite(11,HIGH);
digitalWrite(10,LOW);
digitalWrite(12,HIGH);
digitalWrite(13,LOW);
}
else
{
digitalWrite(10,LOW);
digitalWrite(11,LOW);
digitalWrite(12,HIGH);
digitalWrite(13,HIGH);
}
}
