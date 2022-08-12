from attr import field
from matplotlib.pyplot import cla
from rest_framework import serializers
from contactApp.models import PhoneBook

class PhoneBookSerializer(serializers.ModelSerializer):
    class  Meta:
        model=PhoneBook
        fields=['name','phone','email']

