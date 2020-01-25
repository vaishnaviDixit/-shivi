


#open function**********************
'''
f=open("mydata.txt","w+")
print(f.name)
print(f.mode)
print(f.closed)
f.close()
print(f.closed)
'''




#w(overwrite)
#w+(overwrite and read)
#a(append)
#a+(append)
#r(read)
#r+(read & write)

#writing in file***************************
'''
f=open("mydata.txt","a+")
for x in range(10):
    f.write("python is very easy %d\n"%(x))
f.close()    
'''


#read command
'''
f=open("mydata.txt","r")
str=f.read(11)
print(str)
f.close()
'''
#reading lines
'''
f=open("mydata.txt","r")
content=f.readlines()
print(content)
for lines in content:
    print(lines)
f.close()
'''




#record add and listing

def listdata():
    with open("student.txt","r")as file:#open file as a list using with clause
        for line in file:
            print(line)
def adddata():
    f=open("student.txt","a")
    roll=input("enter roll")
    name=input("enter name")
    f.write("%s,%s\n"%(roll,name))
    f.close()
for x in range(2):
    adddata()
listdata()




#split fun
'''
str="Ravi is a good boy "
list=str.split()
print(list[1])
for word in list:
    print(word)
    '''






    #searching
def searchdata(roll):
    with open("student.txt")as file:
        for rec in file:
            data=rec.split(",")
            if(data[0]==roll):
                print(rec)
            else:
                print("no data")
searchdata("34")


