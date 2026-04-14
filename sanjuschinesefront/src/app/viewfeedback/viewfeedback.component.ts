import { Component } from '@angular/core';
import { Feedback } from '../models/feedback';
import { FeedbackService } from '../services/feedback.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-viewfeedback',
  imports: [CommonModule],
  templateUrl: './viewfeedback.component.html',
  styleUrl: './viewfeedback.component.css'
})
export class ViewfeedbackComponent {

   oarr :Feedback [] =[]
      constructor(private fs:FeedbackService)
      {}
      ngOnInit(): void {
         this.fs.getAllFeedback().subscribe(data=>{
            if(data.length>0)
            {
              this.oarr=data
            }
         })
      }
}
