import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServicesService } from 'src/app/Services/services.service';
import { Game } from '../game';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  constructor(private serviceService: ServicesService ,private router : Router) { }

  gamelist: Game = new Game();

  ngOnInit() {
    this.serviceService.getGame().subscribe(data => {
      console.log(data);
      this.gamelist = data;
    });
  }

}
