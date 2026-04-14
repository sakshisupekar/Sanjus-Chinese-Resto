import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Orders } from '../models/orders';
import { OrdersService } from '../services/orders.service';
import { MenuService } from '../services/menu.service';


@Component({
  selector: 'app-orders',
  imports: [CommonModule, FormsModule],
  templateUrl: './orders.component.html',
  styleUrl: './orders.component.css'
})
export class OrdersComponent {
mnm=""
mp=0

o:Orders=new Orders



constructor(private route:ActivatedRoute, private os:OrdersService,private router:Router, ms:MenuService)
{

  this.mnm= route.snapshot.params["mnm"]
  this.mp=route.snapshot.params["mp"]
 
  
 }
Totalprice() {
    if (this.mp && this.o.quantity) {
      this.o.totalprice = this.mp * this.o.quantity;
    }
  }

submitdata()
{
  
  this.o.emailid = localStorage.getItem("emailid") 
  this.o.dishName = this.mnm;
  this.o.totalprice = this.mp;

 
  this.o.totalprice = this.mp * this.o.quantity;
console.log("Order sending to backend:", this.o); 
  this.os.insert(this.o).subscribe(data => {
    if (data != null) {
      alert("Order placed successfully!");
      this.router.navigate(["/menu"]);
    }
  });
  
}
cancelOrder(orderId: number) {
    this.os.cancelOrder(orderId).subscribe(updatedOrder => {
      const order = this.os.getAll();
      if (order) this.o.status = 'Cancelled';
    });
  }
}

