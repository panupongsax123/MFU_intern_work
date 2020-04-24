import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { ListComponent } from './list/list.component';
import { AboutComponent } from './about/about.component';
import { DetailComponent } from './detail/detail.component';
import { EditComponent } from './edit/edit.component';
import { AddComponent } from './add/add.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { SignUpComponent } from './sign-up/sign-up.component';

const appRoutes: Routes = [
  { path: 'list', component: ListComponent },
  { path: 'home', component: HomepageComponent },
  { path: 'list/:id', component: DetailComponent },
  { path: 'edit/:id', component: EditComponent },
  { path: 'add', component: AddComponent },
  { path: 'contacts', component: AboutComponent },
  { path: 'sign-in', component: SignInComponent },
  { path: 'sign-up', component: SignUpComponent },
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

