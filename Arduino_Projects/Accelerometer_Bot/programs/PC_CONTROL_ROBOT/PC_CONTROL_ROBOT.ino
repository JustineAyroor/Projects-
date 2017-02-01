void setup()
{
pinMode(10,OUTPUT);
pinMode(11,OUTPUT);
pinMode(12,OUTPUT);
pinMode(13,OUTPUT);
Serial.begin(9600);
Serial.println("START THE ROBOT");
}

void loop()
{
if(Serial.available()>0)
{
char c = Serial.read();
if(c=='a' || c=='A'){                         //LEFT TURN
Serial.println("LEFT");
digitalWrite(10,LOW);
digitalWrite(11,HIGH);
digitalWrite(12,HIGH);
digitalWrite(13,LOW);
}

if(c=='D' || c=='d'){                         //RIGHT TURN
Serial.println("RIGHT");
digitalWrite(10,HIGH);
digitalWrite(11,LOW);
digitalWrite(12,LOW);
digitalWrite(13,HIGH);
}

if(c=='W' || c=='w'){                         //FORWARD
Serial.println("FORWARD");
digitalWrite(10,HIGH);
digitalWrite(11,LOW);
digitalWrite(12,HIGH);
digitalWrite(13,LOW);
}

if(c=='X' || c=='x'){                         //BACKWARD
Serial.println("BACKWARD");
digitalWrite(10,LOW);
digitalWrite(11,HIGH);
digitalWrite(12,LOW);
digitalWrite(13,HIGH);
}

if(c=='s' || c=='S'){                         //STOP
Serial.println("STOP");
digitalWrite(10,LOW);
digitalWrite(11,LOW);
digitalWrite(12,LOW);
digitalWrite(13,LOW);
}
}
}
