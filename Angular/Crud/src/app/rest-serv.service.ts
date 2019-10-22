import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Resturant} from './resturant.model';

@Injectable({
  providedIn: 'root'
})
export class RestServService {

  constructor(private http:HttpClient) { }

  saveResturant(resturant:Resturant)
  {
    return this.http.post<any>('http://localhost:1023/resturant',resturant);
  }

}
