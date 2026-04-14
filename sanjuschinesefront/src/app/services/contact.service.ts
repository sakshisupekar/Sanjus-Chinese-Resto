import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Contact } from '../models/contact';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ContactService {

  serverurl="http://localhost:9009/sanjuschineseresto/contact"
  constructor( private http:HttpClient) { }

   insert(cs: Contact): Observable<Contact> {
    return this.http.post<Contact>(this.serverurl,cs);
  }

  // Get All Feedback
  getAllContact(): Observable<Contact[]> {
    return this.http.get<Contact[]>(this.serverurl);
  }
}
