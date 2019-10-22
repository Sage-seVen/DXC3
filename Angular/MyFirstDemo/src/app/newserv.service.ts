import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class NewservService {

  constructor() { }

  testMeth()
  {

    console.log('from srv ');
  }
}
