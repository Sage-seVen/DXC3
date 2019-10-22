import { Component, OnChanges } from '@angular/core';
import { DocservService } from './docserv.service';
import { doctor } from './doctor.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  {
  title = 'crudDoctor';

  constructor(private refserv:DocservService){  }
  
  //id;name;degree;hospital;
  //if using local variables it must be initialized on click, or will be initiliazed with string data this.sth
  
  doc:doctor={"id":0,"name":"","degree":"","hospital":""};//need to be initialized with default props, so that it can change later. else wont be able t change undefined values

   savedd(){
    //this.doc={"id":this.id,"name":this.name,"degree":this.degree,"hospital":this.hospital}
 
    this.refserv.savedoctor(this.doc).subscribe( data=> console.log(data), error=>console.log(error) );
  }

  updatedd()
  {
    this.refserv.updatedoctor(this.doc).subscribe(
      data=> console.log(data),
      error=>console.log(error)
    );
  }

  resturants:doctor[]=[];
  getdd()
  {

      this.refserv.getAlldoctors().subscribe(
      data=> this.resturants=data,
      error=>console.log(error)
    );

    for(let rest of this.resturants)
    {
      console.log(rest.name);
    }

  }

  deletedd()
  {
    this.refserv.deletedoctor(this.doc.id).subscribe(
      data=> console.log(data),
      error=>console.log(error)
    );
  }


  getone()
  {
    this.refserv.getdoctor(this.doc.id).subscribe(
      data=> this.doc=data,
      error=>console.log(error)
    );

    console.log(this.doc.id);
  }


}
