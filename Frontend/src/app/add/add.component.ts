import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service/service.service';
import { Games } from '../model/games';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private serviceService: ServiceService) { }

  add: Games = new Games();
  
  addGame(){
    console.log('Add Complete')
    this.serviceService.addGame(this.add).subscribe(data => {
      console.log(data);
    });
  }

  ngOnInit() {
  }

}
