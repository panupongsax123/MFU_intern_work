import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Games } from '../modelGames/games';
import { Users } from '../modelUsers/users';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http: HttpClient) { }

  Url = 'http://localhost:9999/games/';
  Url2 = 'http://localhost:9999/users/';

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
    // alert("Delete Successful");
    return this.http.delete(this.Url + "delete/" + id, {
      headers: new HttpHeaders().set('Content-Type', 'application/json'),
      responseType: 'text'
    });
  }


  addUser(body: Users): Observable<any> {
    alert("Add User Successful");
    return this.http.post(this.Url2 + "addUser", body, {
      headers: new HttpHeaders().set('Content-Type', 'application/json'),
      responseType: 'text'
    });
  }
}
