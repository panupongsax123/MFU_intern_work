import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'internshipwork';

  constructor(private router: Router) { }

  List() {
    // console.log("List Book");
    this.router.navigate(["list"]);
  }
}
