#recursive function

'''
def fact(num):
    if num==1:
        return(1)
    else:
        return(num*fact(num-1))
print(fact(5))
'''
#power
'''
def pow(x,n):
    if n==0:
        return(1)
    else:
        return (x*pow(x,n-1))
print(pow(2,3))    
'''
#sum of  digits
#non modifying return
'''
def sod(num,s):
    
    if num==0:
        return(s)
    else:
        return(sod(num//10,s+(num%10)))
print(sod(12345,0))
'''

#more than one type recll
#was count of digits
'''
def count(num,digit,c):
    if num==0:
        return(c)
    elif(num%10)==digit:
        return(count(num//10,digit,c+1))
    else:
        return(count(num//10,digit,c))
print(count(1112122121212121212121121212,3,0))
'''
#backward tracking
'''
def printdigit(num):
    if num==0:
        return
    else:
        printdigit(num//10)
        print(num%10)
        
printdigit(12345)
'''
#convert dec to bin
def dectobin(num):
    if num==0:
        return
    else:
        dectobin(num//2)
        print(num%2)
dectobin(123)

        

        
