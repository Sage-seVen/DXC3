import { Component } from '@angular/core';
import { Resturant } from './resturant.model';
import { RestServService } from './rest-serv.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Crud';

  constructor(private restSrv:RestServService)
  {}

  resturant:Resturant={"resturantId":5,"resturantName":"khab","location":"jammu","rating":9};
  saveResturant()
  {
    this.restSrv.saveResturant(this.resturant).subscribe(
      data=> console.log(data),
      error=>console.log(error)
    );
  }
}
