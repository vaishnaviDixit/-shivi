from django.db import models

class Info(models.Model):
    name=models.CharField(max_length=50)
    email = models.CharField(max_length=50)
    gender = models.CharField(max_length=15)
    address = models.CharField(max_length=100)
    occupation = models.CharField(max_length=50)
    exservice = models.CharField(max_length=10)
    def __str__(self):
        return(str(self.name)+"- ["+str(self.occupation)+"]")