from django.db import models

# Create your models here.
class PhoneBook(models.Model):
    name=models.CharField(max_length=30,primary_key=True)
    phone=models.CharField(max_length=10)
    email=models.EmailField(blank=True)

    def __str__(self) -> str:
        return self.name+self.phone+self.email

