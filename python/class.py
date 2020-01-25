'''
class student:
        def __init__(self,name):
            self.name=name
            self.attend=0
            self.marks=[]
            print("welcome",name)
        def __str__(self):
            return("name{}\nattend{}\marks{}".format(self.name,self.attend,self.marks))
        def addattance(self):
            self.marks.append(m)
        def getavg(self):

            return(sum(self.marks)/len(self.marks))
ss=student("vaishnavi")
print(str(ss))
ss.addattance()
ss.addmarks(23)
ss.addmarks(56)
ss.addmarks(45)
print(ss.getavg())
print(str(ss))
'''
#inheritance or code,class  reusibility********************************


class person:
    def __init__(self,name):
        self.name=name
        print(name)
class teacher(person):
    def __init__(self,name,sub):
     person.__init__(self,name)
     self.sub=sub
     print(self.sub)
t=teacher("raj","python")










     
