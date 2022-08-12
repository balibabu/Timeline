from django.db import models

# Create your models here.
class PhoneBook(models.Model):
    name=models.CharField(max_length=20)
    phone=models.CharField(max_length=10,primary_key=True)
    email=models.CharField(max_length=30)

    def __str__(self):
        return self.name+self.phone+self.email


