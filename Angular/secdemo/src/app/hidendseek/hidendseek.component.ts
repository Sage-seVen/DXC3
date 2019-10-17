import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hidendseek',
  templateUrl: './hidendseek.component.html',
  styleUrls: ['./hidendseek.component.css']
})
export class HidendseekComponent implements OnInit {


  ngOnInit() {
  }

  author:any[];

  vis:boolean=false;
  temp:String="Show";
  dref;
  d;
  
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

  hide()
  {
    
    if(this.vis==true)
    {
      this.vis=false;
      this.temp="show";
    }
    else{
    this.vis=true;
    this.temp="hide";
    }
  }

  dis()
  {
    this.dref=this.d;
  }
}
