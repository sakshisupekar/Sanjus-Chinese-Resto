import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Registration } from '../models/registration';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {
  serverurl="http://localhost:9009/sanjuschineseresto/registration"

  constructor(private http:HttpClient) { }
  getAll():Observable<Registration[]>
  {
    return this.http.get<Registration[]>(this.serverurl);
  }
  login(e:any,p:any):Observable<Registration[]>
  {
    return this.http.get<Registration[]>(this.serverurl+"/"+e+"/"+p)
  }
  insertrecord(r:Registration):Observable<Registration>
  {
    return this.http.post<Registration>(this.serverurl,r)
  }

}
