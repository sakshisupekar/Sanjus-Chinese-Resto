import { Injectable } from '@angular/core';
import { Feedback } from '../models/feedback';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FeedbackService {

  serverurl="http://localhost:9009/sanjuschineseresto/feedback"
  constructor( private http:HttpClient) { }

   saveFeedback(feedback: Feedback): Observable<Feedback> {
    return this.http.post<Feedback>(this.serverurl,feedback);
  }

  // Get All Feedback
  getAllFeedback(): Observable<Feedback[]> {
    return this.http.get<Feedback[]>(this.serverurl);
  }
}
