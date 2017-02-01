import RPi.GPIO as GPIO
import time
GPIO.setmode(GPIO.BOARD)
GPIO.setwarnings(False)
MOTOR_E1 = 7
MOTOR_E2 = 11
MOTOR_1A = 13
MOTOR_1B = 15
GPIO.setup(MOTOR_E1, GPIO.OUT)
GPIO.setup(MOTOR_E2, GPIO.OUT)
GPIO.setup(MOTOR_1A, GPIO.OUT)
GPIO.setup(MOTOR_1B, GPIO.OUT)

a = int(input("enter the status"))

GPIO.output(MOTOR_E1,True)
GPIO.output(MOTOR_E2,True)

if (a == 1):
    print("MOTOR ON")
    GPIO.output(MOTOR_1A,True)
    GPIO.output(MOTOR_1B,False)
    time.sleep(5)
elif (a == 0):
    print("MOTOR OFF")
    GPIO.output(MOTOR_1A,False)
    GPIO.output(MOTOR_1B,False)
    time.sleep(5)
else:
    print("MOTOR OFF..")
    GPIO.output(MOTOR_1A,False)
    GPIO.output(MOTOR_1B,False)
    time.sleep(5)

GPIO.cleanup()    
