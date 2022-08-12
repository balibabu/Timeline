from django import views
from django.shortcuts import render
from rest_framework import viewsets
from contactApp.models import PhoneBook
from contactApp.serializers import PhoneBookSerializer

# Create your views here.
class PhoneBookViewSet(viewsets.ModelViewSet):
    queryset=PhoneBook.objects.all()
    serializer_class=PhoneBookSerializer