from Tkinter import *
 
class Application (Frame):
    def __init__(self,master):
        Frame.__init__(self,master)
        self.grid()
		self.create_widgets()
		
	def create_widgets(self):
        self.label=Label(self,text="   **********SIMPLE GUI**********")
        self.label.grid(row=0,column=0,sticky=W)
        self.noob1()
        
	def noob1(self):    
        self.label1=Label(self,text="DISPLAY HI AND HELLO ")
        self.label1.grid(row=1,column=0,columnspan=2,sticky=W)

        self.op11=BooleanVar()
        Checkbutton(self,text="HI",variable=self.op11).grid(row=2,column=0,sticky=W)

        self.op21=BooleanVar()
        Checkbutton(self,text="HELLO",variable=self.op21).grid(row=3,column=0,sticky=W)
    
		self.button1=Button(self,text="Submit")
        self.button1["command"]=self.result_noob1
        self.button1.grid()
		
		#output text box
        self.text1=Text(self,width=35,height=1,wrap=WORD)
        self.text1.grid(row=7,column=0,columnspan=3)

	def result_noob1(self):
        res1= ""    
        if  self.op11.get():
            res1 ="HI"
        elif self.op21.get():
            res1 ="HELLO"
			
#create window
root=Tk()

# modify the window
root.title("GUI Task")
root.geometry("400x400")

app=Application(root)
root.mainloop()
