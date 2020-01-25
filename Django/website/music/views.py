from django.shortcuts import render,get_object_or_404
from .models import Album


def index(request):
    content={'all_albums': Album.objects.all()}
    return render(request,'music/index.html',content)
def details(request,album_id):
    album=get_object_or_404(Album,id=album_id)
    return render(request,'music/details.html',{'album': album})



