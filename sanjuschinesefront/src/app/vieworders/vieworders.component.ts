import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Menu } from '../models/menu';
import { MenuService } from '../services/menu.service';
import { Orders } from '../models/orders';
import { OrdersService } from '../services/orders.service';

@Component({
  selector: 'app-vieworders',
  imports: [FormsModule,CommonModule],
  templateUrl: './vieworders.component.html',
  styleUrl: './vieworders.component.css'
})
export class ViewordersComponent implements OnInit {

  oarr: Orders[] = [];

  constructor(private os: OrdersService) {}

  ngOnInit(): void {
    this.loadAllOrders();
  }

  loadAllOrders(): void {
    this.os.getAll().subscribe(data=>{
            if(data.length>0)
            {
              this.oarr=data
            }
         })
  }
  


}