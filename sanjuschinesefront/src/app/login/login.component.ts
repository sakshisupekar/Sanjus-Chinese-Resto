import { Component } from '@angular/core';
import { Registration } from '../models/registration';
import { FormsModule } from '@angular/forms';
import { RegistrationService } from '../services/registration.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  imports: [FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  isloggedIn=false
 reg:Registration = new Registration()
 constructor (private rs: RegistrationService,private router:Router)
 {

 }
 submitdata()
 {
this.rs.login(this.reg.emailid,this.reg.password).subscribe(data=>{
  if(data.length>0)
  {
    alert("login Successfull")
    localStorage.setItem("emailid",this.reg.emailid)
    this.router.navigate(["/menu"])
  }
  else
    alert("invalid email or password")
})
 }
}
