from django.db import models

class Passenger(models.Model):
    id=models.IntegerField(primary_key=True)
    firstName=models.CharField(max_length=20)
    lastName=models.CharField(max_length=20)
    travelPoints=models.DecimalField(max_digits=10,decimal_places=2)
    
    def __str__(self):
        return self.id+self.firstName+self.lastName+self.travelPoints