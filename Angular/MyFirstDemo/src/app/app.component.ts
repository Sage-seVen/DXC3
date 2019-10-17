import { Component } from '@angular/core';
import { Player } from './player.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'JS Selector';


  State=['Delhi','Jharkhand','tamil nadu','punjab'];
  City=[['noida','gurgaon','south delhi'],['ranchi','bokaro','dhanbad'],['chennai','koyambedu','tirupali'],['jalandar','amritsar','luadiana']];


  test='test this value'
  childMsg; //variable
  msg;
  msgToChild;
  a;
  b;
  tot;

  vision:boolean=false;
  vision1:boolean=false;

  sendChild()
  {
    this.msg=this.msgToChild;
  }

  add()
  {
    this.tot=this.a+this.b;
  }

  pobj=new Player;
  name;
  id;
  age;
  no;

    details(){
    
    this.pobj.pname=this.name;
    this.pobj.pid=this.id;
    this.pobj.page=this.age;
    this.pobj.pno=this.no.split(",");
  }

  change(){
    if (this.vision==false)
    this.vision=true;
    else this.vision1=true;
  }


  author:any[];

  
  
  constructor()
  {
    this.author=
    [
    {authorId:1,authorName:'raj',authorGender:'male',marital:'Single'},
    {authorId:2,authorName:'rajeev',authorGender:'male',marital:'Married'},
    {authorId:3,authorName:'rajeshwari',authorGender:'female',marital:'Married'},
    {authorId:4,authorName:'rajni',authorGender:'female',marital:'Single'}
    ]
  }
}
