from django.shortcuts import render
from .models import Info
def index(request):
    return render(request,'register.html')
def register(request):
    try:

        name=request.POST['name']
        email = request.POST['email']
        gender = request.POST['gender']
        address = request.POST['address']
        occupation = request.POST['occupation']
        if "exservice" not in request.POST:
            exservice='No'
        else:
            exservice=request.POST['exservice']
        exservice= request.POST['exservice']
        rec =Info()
        rec.name=name
        rec.email=email
        rec.gender=gender
        rec.address=address
        rec.occupation=occupation
        rec.exservice=exservice
        rec.save()
    except:
         msg="something went wrong "
         return render(request,'register.html',{'msg':msg})
    else:
        msg="registration success :)  !!!!!!!! "
        return render(request,'register.html',{'msg':msg})


