import RPi.GPIO as GPIO
from flask import Flask, request, render_template                               
import time

GPIO.setmode(GPIO.BOARD)
GPIO.setwarnings(False)

app = Flask(__name__)                                                           
pin = 8 
GPIO.setup(pin, GPIO.OUT)

@app.route("/")
def hello():
    return "Helllo World"                                                                 
@app.route("/status/<state>")                                           
def update_lamp(state=None):                                                    
    if state == 'on':                                                           
        GPIO.output(pin, GPIO.HIGH)
        time.sleep(2) 
	state ='on'               
    if state == 'off':        
        GPIO.output(pin, GPIO.LOW) 
        time.sleep(2) 
	state = 'off'

    return render_template('main.html',title=state)

if __name__ == "__main__":                                                      
    app.run(host='0.0.0.0', port=8080)
