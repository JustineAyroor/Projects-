import RPi.GPIO as GPIO
import time
GPIO.setmode(GPIO.BOARD)
GPIO.setwarnings(False)
GPIO.setup(7, GPIO.OUT)
GPIO.setup(11, GPIO.OUT)
GPIO.setup(13, GPIO.OUT)
GPIO.setup(15, GPIO.OUT)

a = int(input("enter the status"))

GPIO.output(7,True)
GPIO.output(11,True)

if (a == 1):
    print("MOTOR ON")
    GPIO.output(13,True)
    GPIO.output(15,False)
elif (a == 0):
    print("MOTOR OFF")
    GPIO.output(13,False)
    GPIO.output(15,False)
else:
    print("MOTOR OFF..")
    GPIO.output(13,False)
    GPIO.output(15,False)

GPIO.cleanup()    
