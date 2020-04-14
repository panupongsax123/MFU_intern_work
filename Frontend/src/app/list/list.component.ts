import { Component, OnInit } from '@angular/core';
import { Games } from '../model/games';
import { ServiceService } from '../service/service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  constructor(private serviceService: ServiceService, private router: Router) { }

  gamelist: Games = new Games();

  ngOnInit() {
    this.serviceService.getGames().subscribe(data => {
      this.gamelist = data;
    });
  }

}
