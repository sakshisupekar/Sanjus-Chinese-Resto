import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Menu } from '../models/menu';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class MenuService {

  serverurl="http://localhost:9009/sanjuschineseresto/menu"
  constructor( private http:HttpClient) { }

  insert(m:Menu):Observable<Menu>
  {
    return this.http.post <Menu>(this.serverurl,m)
  }
  getAll():Observable<Menu[]>
  {
    return this.http.get<Menu[]>(this.serverurl)
  }
  delete(menuid:any):Observable<any>
  {
    return this.http.delete(this.serverurl+"/"+menuid)
  }
  update(menuid:any,m:Menu):Observable<Menu>
  {
    return this.http.put<Menu>(this.serverurl+"/"+menuid,m)
  }
  search(menuid:any):Observable<Menu>
  {
    return this.http.get<Menu>(this.serverurl+"/"+menuid)
  }
}
