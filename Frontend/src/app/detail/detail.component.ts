import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service/service.service';
import { ActivatedRoute } from '@angular/router';
import { Games } from '../model/games';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {

  constructor(private serviceService: ServiceService,
    private route: ActivatedRoute) { }

  gamelist: Games = new Games();
  edit: Games = new Games();
  sub: any;
  id: number;

  ngOnInit() {

    this.sub = this.route.params.subscribe(params=>{
      console.log("params : ", params);
        
      this.id = Number(params.id);

      console.log("id : ", this.id);
      
      //find Book Detail by Id
        this.serviceService.getGamesById(this.id).subscribe((data => {
          this.gamelist = data;
          console.log("GameDetail : ", data);
          
        }));
    });
  }

}
