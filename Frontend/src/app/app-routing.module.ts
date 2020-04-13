import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { ListComponent } from './list/list.component';
import { AboutComponent } from './about/about.component';

const appRoutes: Routes = [
  { path: 'list', component: ListComponent },
  { path: 'home', component: HomepageComponent },
  { path: 'about', component: AboutComponent },
  {
    path: '',
    redirectTo: '/home',
    pathMatch: 'full'
  },
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes,
    { enableTracing: false } 
  )
  ],
    exports: [RouterModule]
})
export class AppRoutingModule { }

