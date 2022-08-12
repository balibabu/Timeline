from urllib import response
from django.shortcuts import render
from django.http import JsonResponse
from firstApp.models import Employee

def empployeeView(request):
    emp={
        'id':123,
        'name':'John',
        'sal':5000
    }
    data=Employee.objects.all();
    response={'employee':list(data.values('name','sal'))}
    return JsonResponse(response)