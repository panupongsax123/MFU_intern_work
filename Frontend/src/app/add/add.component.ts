import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service/service.service';
import { Router } from '@angular/router';
import { Games } from '../modelGames/games';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private serviceService: ServiceService, private router: Router) { }

  add: Games = new Games();

  ngOnInit() {
  }

  addGame() {
    console.log('Add Complete')
    this.serviceService.addGame(this.add).subscribe(data => {
      this.gotoList();
    });
  }

  gotoList() {
    this.router.navigate(['/list']);
  }
}
