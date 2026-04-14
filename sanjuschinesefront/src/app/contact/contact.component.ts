import { Component } from '@angular/core';
import { connect } from 'rxjs';
import { Contact } from '../models/contact';
import { ContactService } from '../services/contact.service';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-contact',
  imports: [CommonModule,FormsModule],
  templateUrl: './contact.component.html',
  styleUrl: './contact.component.css'
})
export class ContactComponent {
 con: Contact = new Contact()
  constructor(private cs: ContactService, private router:Router ) {

  }
  submitdata() {
    this.cs.insert(this.con).subscribe(data => {
      if (data != null) {
       
        alert("Your message has been sent successfully! Successfully")
        
        this.router.navigate(["/"])
      }
      
    })


  }
}
