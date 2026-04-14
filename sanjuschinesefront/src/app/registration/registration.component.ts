import { Component } from '@angular/core';
import { Registration } from '../models/registration';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { RegistrationService } from '../services/registration.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registration',
  imports: [FormsModule, CommonModule],
  templateUrl: './registration.component.html',
  styleUrl: './registration.component.css'
})
export class RegistrationComponent {

  reg: Registration = new Registration()
  constructor(private rs: RegistrationService, private router:Router ) {

  }
  submitdata() {
    this.rs.insertrecord(this.reg).subscribe(data => {
      if (data != null) {
       
        alert("registration Successfully")
        
        this.router.navigate(["/menu"])
      }
      
    })


  }
}