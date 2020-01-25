#print ci {amt ,rate ,time }enter
#formula ci=p(1+R/100)^t)
#def ci(p,r,t):
p=int(input("enter principle amt"))
R=float(input("enter rate"))
t=int(input("enter time"))
cmpi=p* (pow((1+R//100),t))
print("ci is",cmpi)
