import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Menu } from '../models/menu';
import { MenuService } from '../services/menu.service';

@Component({
  selector: 'app-addmenu',
  imports: [FormsModule,CommonModule],
  templateUrl: './addmenu.component.html',
  styleUrl: './addmenu.component.css'
})
export class AddmenuComponent {
m:Menu = new Menu()
  constructor (private ms: MenuService){}
  submitdata()
  {
this.ms.insert(this.m).subscribe(data=>{
  if(data!= null)
  {
    alert("Menu Added Scucessfully")
  }
})
  }
}
