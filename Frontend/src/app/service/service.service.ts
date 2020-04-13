import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http: HttpClient) { }

  Url = 'http://localhost:8080/';

  getGames(): Observable<any> {
    console.log(this.Url + "list");
    return this.http.get(this.Url + "list");
  }
}
