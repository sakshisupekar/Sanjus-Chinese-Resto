import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Feedback } from '../models/feedback';
import { FeedbackService } from '../services/feedback.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-feedback',
  imports: [FormsModule,CommonModule],
  templateUrl: './feedback.component.html',
  styleUrl: './feedback.component.css'
})
export class FeedbackComponent {

  f: Feedback = new Feedback();
  stars: number[] = [1, 2, 3, 4, 5];   // ⭐⭐⭐⭐⭐

  constructor(private fs: FeedbackService, private router: Router) {}

  setRating(rating: number) {
    this.f.rating = rating;
  }

  submitdata() {
    this.f.userName = localStorage.getItem("username") || this.f.userName;

    this.fs.saveFeedback(this.f).subscribe(data => {
      if (data != null) {
        alert("Feedback submitted successfully!");
        this.router.navigate(["/"]);   // form submit झाल्यावर home/menu page वर redirect
      }
    });
  }
}
