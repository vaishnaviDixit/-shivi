'''
#functions
def function1():
    pass 
    function1 ()






    
def myfun(num):
    print (float(num)*2)
myfun(10)







#was to print armstrong
from math import pow as p
def isarm(num):
    ori=num
    sum=0
    while num>0:
        d=num%10
        sum+=p(d,3)
        num=num//10
    if sum==ori:
        return("arm")
    else:
        return("not arm")
val=isarm(153)
print(val)







def detail(name,roll):
    print("name is ",name)
    print("roll is",roll)
detail(100,"amit")    #wrong way
detail(roll=100,name="amit")#correct way always call fn along with parameters in arguments

'''











#default arg
def SI(p=100,r=2.5,t=3):
    return((p*r*t)/100)
val=SI()#val=SI(t=4)
print(val)


