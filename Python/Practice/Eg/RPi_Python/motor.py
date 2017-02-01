import Rpi.GPIO as GPIO
from time import sleep

GPIO.setmode(GPIO.BOARD)
GPIO.setwarnings(False)

MOTOR_1A = 13
MOTOR_1B = 15
MOTOR_1E = 7
MOTOR_2E = 11

GPIO.setup(MOTOR_1A,GPIO.OUT)
GPIO.setup(MOTOR_1B,GPIO.OUT)
GPIO.setup(MOTOR_1E,GPIO.OUT)
GPIO.setup(MOTOR_2E,GPIO.OUT)

print ("TURNING MOTOR ON.....")

GPIO.output(M0TOR_1E,True)
GPIO.output(MOTOR_2E,True)

while True:
    GPIO.output(MOTOR_1A,True)
    GPIO.output(MOTOR_1B,False)
    time.sleep(5)

    GPIO.output(MOTOR_1A,False)
    GPIO.OUTPUT(MOTOR_1B,False)
    time.sleep(5)

GPIO.cleanup()
    
