import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Player } from '../player.model';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {


  @Input("xyz") uname:string;
  @Input("xyz1") ref:number;
  @Input("det1") chdet1:Player;

  @Output() evnChild=new EventEmitter();

  constructor() { }

  ngOnInit() {
  }


  // sendMsg()
  // {
  //   this.evnChild.emit("HELLO FROM CHILD");
  // }

  msgToParent;
  
  sendMsg()
  {
    this.evnChild.emit(this.msgToParent);
  }
}

