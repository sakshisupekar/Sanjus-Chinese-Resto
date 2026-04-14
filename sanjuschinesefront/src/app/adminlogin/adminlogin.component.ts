import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Adminlogin } from '../models/adminlogin';
import { AdminloginService } from '../services/adminlogin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  imports: [FormsModule],
  templateUrl: './adminlogin.component.html',
  styleUrl: './adminlogin.component.css'
})
export class AdminloginComponent {
adm:Adminlogin=new Adminlogin
constructor(private as:AdminloginService, private router:Router){}
submitdata()
{
 this.as.login(this.adm.emailid,this.adm.password).subscribe(data=>{
  if(data.length>0)
  {
    alert("admin login Successfully")
    localStorage.setItem("aemailid",this.adm.emailid)
    this.router.navigate(["/"])
  }
 })

 
}
}
