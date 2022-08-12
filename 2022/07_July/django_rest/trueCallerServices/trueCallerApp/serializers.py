from dataclasses import field
from rest_framework import serializers
from trueCallerApp.models import PhoneBook
import re

class PhoneBookSerializer(serializers.ModelSerializer):
    class Meta:
        model=PhoneBook
        fields=['name','phone','email']
        
