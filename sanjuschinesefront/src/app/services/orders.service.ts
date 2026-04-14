import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Orders } from '../models/orders';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OrdersService {
  serverurl = "http://localhost:9009/sanjuschineseresto/order"
  constructor(private http: HttpClient) {

  }
  insert(o: Orders): Observable<Orders> {
    return this.http.post<Orders>(this.serverurl, o)
  }
  getAll(): Observable<Orders[]> {
    return this.http.get<Orders[]>(this.serverurl)
  }
  cancelOrder(orderid: any): Observable<Orders> {
    return this.http.put<Orders>(`${this.serverurl}/${orderid}`, null);
  }
}
