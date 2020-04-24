import { Component, OnInit } from '@angular/core';
import { Games, ModelGames } from '../model/games';
import { ServiceService } from '../service/service.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  constructor(private serviceService: ServiceService,
    private route: ActivatedRoute, private router: Router) { }

  gamelist: Games = new Games();
  // gamelist: Games = new Games();
  edit: ModelGames = new ModelGames();
  sub: any;
  id: number;

  ngOnInit() {


    this.sub = this.route.params.subscribe(params => {
      this.id = Number(params.id);
      console.log("Edit id :", this.id);
      this.serviceService.getGamesById(this.id).subscribe((data => {

        this.edit = data;
        this.edit.id = data.id;
        this.edit.name = data.name;
        this.edit.category = data.category;
        this.edit.release_date = data.release_date;
        this.edit.price = data.price;
        this.edit.produce_by = data.produce_by;
        

      }));

    });
  }

  editGame(id) {
    console.log('Update Complete Data: => ', this.edit)
    this.serviceService.editGame(id, this.edit).subscribe(data => {

      this.gotoList();
    });
  }

  gotoList() {
    this.router.navigate(['/list']);
  }

}
