import { Component, OnInit } from '@angular/core';
import { Games } from '../model/games';
import { ServiceService } from '../service/service.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  constructor(private serviceService: ServiceService,
    private route: ActivatedRoute) { }

    gamelist: Games = new Games();
    edit: Games = new Games();
    sub: any;
    id: number;

  ngOnInit() {


    this.sub = this.route.params.subscribe(params=>{ 
      this.id = Number(params.id);
      console.log("Edit id :", this.id);
        this.serviceService.getGamesById(this.id).subscribe((data => {
          this.gamelist = data;
          
        }));
    });
  }

  editGame(id, body){
    console.log('Update Complete Data: => ',this.gamelist)
    this.serviceService.editGame(id, body).subscribe(data => {
      console.log(data);
      this.gamelist = data;
    });
  }

}
