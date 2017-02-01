from flask import Flask, request, render_template
app = Flask(__name__)
app.debug = True # Make this False if you are no longer debugging

@app.route("/")
def hello():
    return "Hello World!"

@app.route("/lab_temp")
def lab_temp():
	import sys
	import Adafruit_DHT
	humidity, temperature = Adafruit_DHT.read_retry(Adafruit_DHT.DHT11, 17)
	if humidity is not None and temperature is not None:
		return render_template("lab_temp.html",temp=temperature,hum=humidity)
	else:
		return render_template("no_sensor.html")

@app.route("/lab_env_db")
def lab_env_db():
	import sqlite3
	conn=sqlite3.connect('/var/www/lab_app/lab_app.db')
	curs=conn.cursor()
	curs.execute("SELECT * FROM temperatures")
	temperatures = curs.fetchall()
	curs.execute("SELECT * FROM humidities")
	humidities = curs.fetchall()
	conn.close()
	return render_template("lab_env_db.html",temp=temperatures,hum=humidities)


@app.route("/status/<state>")
def update_lamp(state=None):
        import RPi.GPIO as GPIO
        import time
        GPIO.setmode(GPIO.BOARD)
        GPIO.setwarnings(False)
        pin = 8
        GPIO.setup(pin,GPIO.OUT)
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
