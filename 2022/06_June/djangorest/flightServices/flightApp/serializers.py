from dataclasses import field
from rest_framework import serializers
from flightApp.models import Flight, Passenger, Reservation
import re

class FlightSerializer(serializers.ModelSerializer):
    class Meta:
        model=Flight
        fields='__all__'

    def validate_flightNumber(self,flightNumber):
        if(re.match("^[a-zA-Z0-9]*$",flightNumber)==None):
            raise serializers.ValidationError("Invalid formate")
        return flightNumber

    def validate(self,data):
        print('in validate')
        print(data)
        return data

class PassengerSerializer(serializers.ModelSerializer):
    class Meta:
        model=Passenger
        fields='__all__'

class ReservationSerializer(serializers.ModelSerializer):
    class Meta:
        model=Reservation
        fields='__all__'
