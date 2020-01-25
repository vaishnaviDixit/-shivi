from tkinter import*
def dowork():
    try:
        server=smtplib.SMTP_SSL('smtp.gmail.com',465)
        server.ehlo()
        server.login(gmail_user,gmail_password)
        server.sendmail(sent_from,to,email_text)
        server.close()
        print("email sent")
    except:
        print("something went wrong!!!!")
    
root=Tk()
l1=Label(root,text='userid',fg='blue',bg='yellow')
l1.grid(row=0,column=0,sticky=E)
l2=Label(root,text='password',fg='blue',bg='yellow').grid(row=0,column=2,sticky='E')
l3=Label(root,text='to',fg='blue',bg='yellow').grid(row=1,column=0,sticky='E')
l4=Label(root,text='subject',fg='blue',bg='yellow').grid(row=2,column=0,sticky='E')
l5=Label(root,text='Message',fg='blue',bg='yellow').grid(row=3,columnspan=3)
v1=StringVar()
v2=StringVar()
v3=StringVar()
v4=StringVar()
v5=StringVar()
e1=Entry(root,textvariable=v1,width="250").grid(row=0,column=0)
e2=Entry(root,textvariable=v2,show='*').grid(row=0,column=3)
e3=Entry(root,textvariable=v3,width=50).grid(row=1,column=1,columnspan=3)
e4=Entry(root,textvariable=v4,width=50).grid(row=2,column=1,columnspan=3)
e5=Entry(root,textvariable=v5).grid(row=3,column=1,columnspan=3)

b=Button(root,text='SEND',fg="red",command=dowork).grid(row=4,column=3)
root.mainloop()
