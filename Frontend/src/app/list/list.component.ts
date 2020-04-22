import { Component, OnInit } from '@angular/core';
import { Games } from '../model/games';
import { ServiceService } from '../service/service.service';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  // game: Observable<Games[]>;

  constructor(private serviceService: ServiceService, private router: Router) { }

  
  gamelist : Games[] = [];
  
  

  ngOnInit() {
    console.log("List all game");
    this.serviceService.getGames().subscribe(data => {
      this.gamelist = data;
    });

  }

  fetchData() {
    this.serviceService.getGames().subscribe(data => {
      this.gamelist = data;
    });

  }

  gameDetails(id: number) {
    this.router.navigate(['list', id]);
  }

  deleteGame(game: Games): void {
    console.log("Delete Game");
    this.serviceService.deleteGame(game.id).subscribe(() => {
      this.fetchData();
    })
  };


}
