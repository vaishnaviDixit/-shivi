#loops



#print (range(10))



#for x in range(2,8,2):
   # print(x)

   
#for x in range(8,-1,-1):
 #   print(x)

 
#enter a no. and print its table
'''
a=int(input("enter num to generate table"))
for x in range(1,11,1):
#or use print(a,"X",x,"=",a*x)
 s=a*x
 print(s)
'''

# use of continue and break
'''
a=int(input("enter num to generate table")) 
for x in range(1,11,1):
    if x==5 or x==8:
        continue
    if x==9:
        break
    print(a,"X",x,"=",a*x)
'''

#while loop
#wap which enters few numbers and print the sum of the numbers until user inputs -99
'''
sum=0
num=0
while num!=-99:    #dummy data
    sum+=num      #work
    num=int(input("enter number"))#change condition
    print(sum)
'''




#next ques
'''
x=0
while x<10:
            print(x)
            x+=1
'''



         #was enter a number print count of digits
num=int(input("enter number"))
sum=0
c=0
while True:
       if num==0:#False statment
              break
       c+=1
       num=num//10
       sum+=num
       print("count",c)
       print("sum is ",sum)





            
