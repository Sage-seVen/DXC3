import { Component } from '@angular/core';
//import { clearTimeout } from 'timers';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'secdemo';

haripriya="some value";
timer:number=5;
interval;

constructor()
{

 //setInterval(()=>{this.haripriya=new Date().toTimeString();} ,1000);
 this.interval=setInterval(()=>{this.timer=this.timer-1; if(this.timer==0) clearInterval(this.interval)} ,1000);
}

// refreshTime()
// {
//  this.haripriya=new Date().toTimeString();
// console.log(this.haripriya)
// }

  
}
