
'''
from tkinter import*
root=Tk()
root.title("my first form")
myframe=Frame(root,height=600,width=600)
myframe.pack()
label=Label(myframe,text="User Name")
label.pack(side="left")
entry=Entry(myframe,bg="yellow",fg='black')
entry.pack(side='left')
button=Button(myframe,text='Login',fg='blue')
button.pack()
root.mainloop()
'''
#make a function tell it what to do and add that fun to command attribute*******
'''
from tkinter import*
def dowork():
    print(entry1.get())
window=Tk()
topframe=Frame(window)
topframe.pack()
label1=Label(topframe,text="user name")
label1.pack(side='left')
entry1=Entry(topframe)
entry1.pack(side='left')
button=Button(topframe,text='click me',fg='red',command=dowork)
button.pack()
window.mainloop()
'''
#mouse events
#use of bind 
from tkinter import*
def lclick(event):
    print("left")
def mclick(event):
    print("middle")
def rclick(event):
    print("right")
root=Tk()
frame=Frame(root,width=200,height=100)
frame.pack(side="top")
frame.bind("<Button-1>",lclick)
frame.bind("<Button-2>",mclick)
frame.bind("<Button-3>",rclick)
root.mainloop()
