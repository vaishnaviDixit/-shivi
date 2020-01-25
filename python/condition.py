age=int(input("enter age"))
sexcode=str(input("enter f for female and m for male "))
if age< 18 and sexcode=='f' :
    print("teen female")
elif age< 18 and sexcode=='m' :
    print("teen male")
elif age<40 and sexcode=='f':
    print("adult female")
elif age<40 and sexcode=='m':
    print("adult female")
    
else:
    print("input invalid")


