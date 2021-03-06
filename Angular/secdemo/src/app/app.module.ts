import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SwitcherComponent } from './switcher/switcher.component';
import {FormsModule} from '@angular/forms';
import { HidendseekComponent } from './hidendseek/hidendseek.component';

@NgModule({
  declarations: [
    AppComponent,
    SwitcherComponent,
    HidendseekComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
