import Rpi.GPIO as GPIO
import time

GPIO.setmode(GPIO.BOARD)
GPIO.setwarnings(False)
TRIG = 16
ECHO = 18
MOTOR_1A = 13
MOTOR_1B = 15
MOTOR_1E = 7
MOTOR_2E = 11

GPIO.setup(TRIG,GPIO.OUT)
GPIO.setup(ECHO,GPIO.IN)
GPIO.setup(MOTOR_1A,GPIO.OUT)
GPIO.setup(MOTOR_1B,GPIO.OUT)
GPIO.setup(MOTOR_1E,GPIO.OUT)
GPIO.setup(MOTOR_2E,GPIO.OUT)

while 1:
    print ("DISTANCE MEASUREMENT IN PROGRESS")
    GPIO.output(TRIG.False)

    print ("WAITING FOR SENSOR TO SETTLE")
    time.sleep(2)

    GPIO.output(TRIG,True)
    time.sleep(0.00001)
    GPIO.output(TRIG,False)

    while GPIO.input(ECHO == 0):
        pulse_start = time.time()

    while GPIO.input(ECHO == 1):
        pulse_end = time.time()
    
    pulse_duration = pulse_end - pulse_start
    distance = pulse_duration * 17150
    distance = round(distance,2)

    print ("distance:",distance,"cm")


    if distance >= 25:
        while distance >= 5:
            print ("MOTOR ON....")
            GPIO.output(M0TOR_1E,True)
            GPIO.output(MOTOR_2E,True)

            GPIO.output(MOTOR_1A,True)
            GPIO.output(MOTOR_1B,False)

        print("MOTOR OFF....")
        GPIO.output(MOTOR_1A,False)
        GPIO.output(MOTOR_1B,False)
    
    elif distance > 30:
        print ("MOTOR OFF.....")
        GPIO.output(MOTOR_1A,True)
        GPIO.output(MOTOR_1B,False)

    else:
        print ("MOTOR OFF")
        GPIO.output(MOTOR_1A,False)
        GPIO.output(MOTOR_1B,False)
    
GPIO.cleanup()
