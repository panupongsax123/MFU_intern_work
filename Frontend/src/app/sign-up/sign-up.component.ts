import { Component, OnInit } from '@angular/core';
import { Users } from '../modelUsers/users';
import { ServiceService } from '../service/service.service';
import { Router } from '@angular/router';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { ApiService } from '../apiservice/api.service';
import { first } from 'rxjs/operators';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
  angForm: FormGroup;
  constructor(private fb: FormBuilder, private dataService: ApiService, private router: Router) {
    this.angForm = this.fb.group({
      username: ['', [Validators.required]],
      nickname: ['', Validators.required],
      password: ['', Validators.required],
      email: ['', [Validators.required, Validators.minLength(1), Validators.email]],
    });
  }

  // add: Users = new Users();

  ngOnInit() {
    console.log("Sign Up page");
  }

  // addUser() {
  //   console.log('Register User Complete')
  //   this.serviceService.addUser(this.add).subscribe(data => {
  //     this.gotoLogin();
  //   });
  // }

  // gotoLogin() {
  //   this.router.navigate(['/sign-in']);
  // }

  postdata(angForm1) {
    this.dataService.userregistration(angForm1.value.username, angForm1.value.nickname, angForm1.value.password, angForm1.value.email)
      .pipe(first())
      .subscribe(
        data => {
          this.router.navigate(['sign-in']);
        },

        error => {
        });
  }

  get username() { return this.angForm.get('username'); }
  get nickname() { return this.angForm.get('nickname'); }
  get password() { return this.angForm.get('password'); }
  get email() { return this.angForm.get('email'); }
  
}


