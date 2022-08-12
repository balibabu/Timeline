import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { LoginService } from './login.service';
import { Criteria } from 'src/app/model/criteria';


@Injectable({
  providedIn: 'root'
})
export class ReservationService {

  flightsUrl:string = "http://127.0.0.1:8000/flightServices/findFlights/";
  singleFlightUrl:string = "http://127.0.0.1:8000/flightServices/flights/";
  saveReservationUrl:string = "http://127.0.0.1:8000/flightServices/saveReservation/";
  flightData:any;

  constructor(private http:HttpClient,private loginService:LoginService) { }

  public getFlights(criteria:Criteria):any{
    return this.http.post(this.flightsUrl,criteria,this.loginService.httpOptions);
  }

  public getFlight(id:number):any{
    return this.http.get(this.singleFlightUrl+id,this.loginService.httpOptions);
  }

  public saveReservation(reservation:any):any{
    return this.http.post(this.saveReservationUrl,reservation,this.loginService.httpOptions);
  }
}





