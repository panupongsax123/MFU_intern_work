import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Games } from '../model/games';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http: HttpClient) { }

  Url = 'http://localhost:8080/';

  getGames(): Observable<any> {
    console.log("List all game");
    return this.http.get(this.Url + "list");
  }

  getGamesById(id: number): Observable<any> {
    return this.http.get(this.Url + "list/" + id);
  }

  addGame(body: Games): Observable<any> {
    console.log('body: ', body)
    return this.http.post(this.Url + "add", body);
  }
}
