from cmath import e
from django.http import Http404
from django.shortcuts import redirect, render
from fbvApp.models import Passenger
from fbvApp.serializers import PassengerSerializer
from rest_framework.response import Response
from rest_framework.decorators import api_view
from rest_framework import status

@api_view(['POST']  /
def myPost(request):
    id = xyz;
    password = 123;
    if(form.a == id and form.b == password):
        redirect("/contacts")
    else:
        status.Http404

@api_view(['GET','POST'])
def passengers_list(request):

    if request.method=='GET':
        passengers=Passenger.objects.all()
        serializer=PassengerSerializer(passengers,many=True)
        return Response(serializer.data)

    elif request.method=='POST':
        serializer=PassengerSerializer(data=request.data)
        if serializer.is_valid():
            serializer.save()
            return Response(serializer.data,status=status.HTTP_201_CREATED)
        return Response(serializer.errors,status=status.HTTP_400_BAD_REQUEST)

@api_view(['GET','PUT','DELETE'])
def passenger_detail(request,pk):
    try:
        passenger=Passenger.objects.get(pk=pk)
    except Passenger.DoesNotExist:
        return Response(status=status.HTTP_404_NOT_FOUND)

    if request.method=='GET':
        serializer=PassengerSerializer(passenger)
        return Response(serializer.data)

    elif request.method=='PUT':
        serializer=PassengerSerializer(passenger,data=request.data)
        if serializer.is_valid():
            serializer.save()
            return Response(serializer.data)
        return Response(serializer.errors,status=status.HTTP_400_BAD_REQUEST)
        
    elif request.method=='DELETE':
        passenger.delete()
        return Response(status=status.HTTP_204_NO_CONTENT)