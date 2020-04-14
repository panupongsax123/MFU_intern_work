import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListComponent } from './list/list.component';
import { HomepageComponent } from './homepage/homepage.component';
import { AboutComponent } from './about/about.component';
import { EditComponent } from './edit/edit.component';
import { DetailComponent } from './detail/detail.component';
import { DeleteComponent } from './delete/delete.component';
import { AddComponent } from './add/add.component';
import { ServiceService } from './service/service.service';


@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    HomepageComponent,
    AboutComponent,
    EditComponent,
    DetailComponent,
    DeleteComponent,
    AddComponent


  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,


  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
