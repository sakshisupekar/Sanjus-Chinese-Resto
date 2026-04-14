import { Component, OnInit } from '@angular/core';
import { MenuService } from '../services/menu.service';
import { Menu } from '../models/menu';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu',
  imports: [CommonModule],
  templateUrl: './menu.component.html',
  styleUrl: './menu.component.css'
})
export class MenuComponent  implements OnInit{
 marr: Menu[]=[]
 isLoggedIn=false
 constructor(private ms:MenuService, private router:Router)
 {

 }
  ngOnInit(): void {
    let em = localStorage.getItem("emailid")
    if(em!= null)
      this.isLoggedIn=true
    else
      this.isLoggedIn=false
    this.ms.getAll().subscribe(data=>{
      if(data.length>0)
        this.marr=data
    })
  }
  order(m:any,mp:any)
  {
    this.router.navigate(['/orders',m ,mp])
  }
}
