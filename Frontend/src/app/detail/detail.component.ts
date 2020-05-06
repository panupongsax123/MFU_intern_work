import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service/service.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Games } from '../modelGames/games';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {

  constructor(private serviceService: ServiceService,
    private route: ActivatedRoute, private router: Router) { }

  games : Games;
  id: number;


  ngOnInit() {

    this.games = new Games();

    this.id = this.route.snapshot.params['id'];
    
    this.serviceService.getGamesById(this.id)
      .subscribe(data => {
        console.log("Detail of : "+ this.id)
        this.games = data;
      }, );
  }

  gotogameEdit(body: Games) {
    this.router.navigate(['edit', body]);
  }
}
