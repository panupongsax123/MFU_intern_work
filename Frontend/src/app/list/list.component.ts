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
  game : Games[];

  ngOnInit() {
    this.serviceService.getGames().subscribe(data => {
      this.gamelist = data;
    });

    this.fetchData();
  }

  fetchData() {
    this.serviceService.getGames().subscribe(data =>{
        this.gamelist = data;
    });

  }

  deleteGame(game: Games): void {
    console.log("Delete Game");
    this.serviceService.deleteGame(game.id).subscribe( () => { this.fetchData();
      }) 
  };


}
