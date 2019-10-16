import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-switcher',
  templateUrl: './switcher.component.html',
  styleUrls: ['./switcher.component.css']
})
export class SwitcherComponent implements OnInit {

  
  testVal;
  x;
  constructor() { }

  ngOnInit() {
  }

  changer()
  {
    this.testVal=this.x;
  }

}
