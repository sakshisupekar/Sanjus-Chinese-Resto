import { Component } from '@angular/core';
import { Contact } from '../models/contact';
import { ContactService } from '../services/contact.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-viewcontact',
  imports: [CommonModule],
  templateUrl: './viewcontact.component.html',
  styleUrl: './viewcontact.component.css'
})
export class ViewcontactComponent {

  
     oarr :Contact [] =[]
        constructor(private cs:ContactService)
        {}
        ngOnInit(): void {
           this.cs.getAllContact().subscribe(data=>{
              if(data.length>0)
              {
                this.oarr=data
              }
           })
        }
}
