import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './footer/footer.component';
import {FormsModule} from '@angular/forms';
import { mstatus } from './mstatus.pipe';
import { NewmodModule } from './newmod/newmod.module';


@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    mstatus
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    NewmodModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
