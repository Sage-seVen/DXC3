import { Injectable } from '@angular/core';
import {doctor} from './doctor.model'
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DocservService {

  constructor(private http:HttpClient ) {

  }

  savedoctor(doc :doctor){
    return this.http.post<any> ('http://localhost:1002/doctor',doc);
  }

  updatedoctor(doc:doctor)
  {
    return this.http.put<doctor>('http://localhost:1002/doctor',doc);
  }

  getAlldoctors()
  {
    return this.http.get<doctor[]>('http://localhost:1002/doctor');
  }


  deletedoctor(docId:number)
  {
    return this.http.delete(`http://localhost:1002/doctor/${docId}`);
  }

  getdoctor(docId:number)
  {
    return this.http.get<doctor>(`http://localhost:1002/doctor/${docId}`);
  }

}