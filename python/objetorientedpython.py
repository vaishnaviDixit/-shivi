#empty class
'''
class AllenHouse:
    pass
x=AllenHouse()
#data members********************
x.name="raju"
print(x.name)
#member function********************
def dowork():
    print("function code")
x.printdata=dowork
x.printdata()
'''


#self as argument************************************
'''
class student():
    def details(self,name):
        self.name=name
    def print(self):
        print("the name is",self.name)

s=student()
s.details(name="raj")
s.print()
        
'''

#overriding in python**********************
#it prooves it follows top to bottom approach********************
'''
class student():
    def  details(self,name,age):
        self.name=name
        self.age=age
        print("within first")
    def details(self,name,age):
        self.name=name
        self.age=age
        print("within second")
    
    def print(self):
        print("name",self.name,"age",self.age)
s=student()
s.details(age=34,name="amit")
'''

        
    

#init and str method use
class student:
    def __init__(self,name,age,cla):
        self.age=age
        self.name=name
        self.cla=cla
    def print(self):
        print("\n name",self.name,"\nage",self.age,"\nclass",self.cla)
    def __str__(self):
        return("{0}studies in class{2} and age is {1}".format(self.name,self.age,self.cla))
        
s=student("vaishnavi",19,"2")
s.print()
print (str(s))
