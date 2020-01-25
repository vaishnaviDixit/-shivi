from django.db import models
class Album(models.Model):
    artist=models.CharField(max_length=50)
    title =models.CharField(max_length=100)
    genre=models.CharField(max_length=50)
    logo = models.CharField(max_length=1000)
    def __str__(self):
        return (self.title+"-"+self.artist)
class Song(models.Model):
    album=models.ForeignKey(Album,on_delete=models.CASCADE)
    filetype=models.CharField(max_length=20)
    title=models.CharField(max_length=100)
    def __str__(self):
        return (self.title+"-"+self.filetype)

