from dataclasses import field
from rest_framework import serializers
from fbvApp.models import Passenger

class PassengerSerializer(serializers.ModelSerializer):
    class Meta:
        model=Passenger
        fields=['id','firstName','lastName','travelPoints']
