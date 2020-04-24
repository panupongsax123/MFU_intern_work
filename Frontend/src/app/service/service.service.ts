import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Games } from '../model/games';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http: HttpClient) { }

  Url = 'http://localhost:8080/games/';

  getGames(): Observable<any> {
    return this.http.get(this.Url + "list");
  }

  getGamesById(id: number): Observable<any> {
    return this.http.get(this.Url + "list/" + id);
  }

  addGame(body: Games): Observable<any> {
    return this.http.post(this.Url + "add", body, {
      headers: new HttpHeaders().set('Content-Type', 'application/json'),
      responseType: 'text'
    });
  }

  editGame(id: number, body: Games): Observable<any> {
    return this.http.post(this.Url + "edit/" + id, body, {
      headers: new HttpHeaders().set('Content-Type', 'application/json'),
      responseType: 'text'
    });

  }

  deleteGame(id: number): Observable<any> {
    alert("Delete Successful");
    return this.http.delete(this.Url + "delete/" + id, {
      headers: new HttpHeaders().set('Content-Type', 'application/json'),
      responseType: 'text'
    });
  }

}
