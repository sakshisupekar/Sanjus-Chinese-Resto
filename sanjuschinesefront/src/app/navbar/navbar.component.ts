import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-navbar',
  standalone: true,
  imports: [RouterLink, CommonModule],
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
isLoggedIn = false;
usertype = "guest";
constructor(private router: Router)
{
  
}
ngOnInit(): void {
    this.router.events.subscribe(val=>{
      if(val!= null)
        {
        let em =localStorage.getItem("emailid")
        console.log(em)
        if(em=="" || em==null)
        {
          let aem=localStorage.getItem("aemailid")
          console.log(aem)
          if(aem!=null)
          {
            this.isLoggedIn=true
            this.usertype="admin"
          }else{
          this.isLoggedIn=false
          this.usertype="guest"
          }
        }
        else
        {
          this.isLoggedIn=true
          this.usertype="customer"
        }
      }
    })
     
  }  
    logout(): void {
    localStorage.removeItem("emailid");
    this.isLoggedIn = false;
    this.usertype = "guest";
    this.router.navigate(["/"]);
  }

  alogout(): void {
    localStorage.removeItem("aemailid");
    this.isLoggedIn = false;
    this.usertype = "guest";
    this.router.navigate(["/"]);
  }

  
}

