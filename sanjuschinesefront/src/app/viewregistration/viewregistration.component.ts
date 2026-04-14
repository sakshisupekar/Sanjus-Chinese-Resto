import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Registration } from '../models/registration';
import { RegistrationService } from '../services/registration.service';

@Component({
  selector: 'app-viewregistration',
  imports: [CommonModule],
  templateUrl: './viewregistration.component.html',
  styleUrl: './viewregistration.component.css'
})
export class ViewregistrationComponent {

    oarr :Registration [] =[]
    constructor(private rs:RegistrationService)
    {}
    ngOnInit(): void {
       this.rs.getAll().subscribe(data=>{
          if(data.length>0)
          {
            this.oarr=data
          }
       })
    }
  
}
