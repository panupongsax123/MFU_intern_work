import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServicesService {

  constructor(private http: HttpClient) { }

  Url = 'http://localhost:4200/';

  getBook(): Observable<any> {
    return this.http.get(this.Url + "listall");
  }
}
