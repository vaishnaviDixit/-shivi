'''
def sum(num,*var):
    s=num
    for x in var:
        s+=x
    print("sum is",s)
sum(10,20)
sum(10,20,30)
sum(10,20,30,40,50,60,70)
'''


#time module***************************************
'''
import time
print (time.time())
t=time.time()
print(time.localtime(t))
print(time.asctime())
'''

#printing table after a time lap***************************
'''
for x in range(1,11):
    time.sleep(3)
    for n in range(1,11):
        print(x,"x",n,"=",x*n)
'''        
#calendar*******************

import calendar
print(calendar.month(2017,5))
print(calendar.isleap(2002))
print(calendar.weekday(2019,7,11))
print(calendar.calendar(2017,1))
