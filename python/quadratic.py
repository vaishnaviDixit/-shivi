#import complex math module
import math
x=int(input("enter value of x"))
y=int(input("enter value of y"))
s=int(math.sqrt(x))
z=int(math.sqrt(y))
l=int(2*x*y)
ans=int(s+z-l)
print(ans)
