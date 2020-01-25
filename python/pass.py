'''
#pass by value
x=10
y=20
num=100
print(id(x))#id prints the base addresss
def swap():
    z=x
    x=y
    y=z
    print(x,y)
    print (id(x))
    print(num)
print(x,y)
print(x,y)
swap()





#pass by ref
def change(list):
    list.append(60)
l=[10,20,30,40]
change(l)
print(l)




#multidiensional list
l=[1,2,3,4,5]
l.append([6,7,8,9])
print(l[5][2])

'''
#matrix programming in python
mat=[]
for x in range(0,4):
    row=[]
    for y in range(0,4):
        row.append(int(input("enter value")))
        mat.append(row) 
      #print(mat[2][2])
for x in range (0,4):
          for y in range (0,4):
              print(mat[x][y],end=" ")
print()  
