from django.http import HttpResponse
from django.shortcuts import render
from rest_framework import viewsets
from trueCallerApp.models import PhoneBook
from trueCallerApp.serializers import PhoneBookSerializer
from rest_framework.response import Response
from rest_framework.decorators import api_view
from rest_framework import status
import json
# from rest_framework.permissions import IsAuthenticated


# Create your views here.
class PhoneBookViewSet(viewsets.ModelViewSet):
    queryset=PhoneBook.objects.all()
    serializer_class=PhoneBookSerializer

    

@api_view(["GET", "POST"])
def login(request):
    if request.method == "GET":
        return render(request, "check.html", {})
    else:
        
        id = request.POST.get('id')
        password = request.POST.get('password')
        
        if(id == "bali" and password == "dhiraj"):

            myData = PhoneBook.objects.all().values();
            return HttpResponse(myData, content_type="text/plain")
        
        else:
            return HttpResponse("Check your credentials", content_type = "text/plain")




