import { Component } from '@angular/core';
import { Orders } from '../models/orders';
import { OrdersService } from '../services/orders.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-myorders',
  imports: [CommonModule],
  templateUrl: './myorders.component.html',
  styleUrl: './myorders.component.css'
})
export class MyordersComponent {

  allOrders: Orders[] = [];
  userOrders: Orders[] = [];

  constructor(private os: OrdersService) {}

  ngOnInit(): void {
    this.os.getAll().subscribe(data => {
      this.allOrders = data;

      const emailid = localStorage.getItem("emailid"); 
      if (emailid) {
        this.userOrders = this.allOrders.filter(o => 
          o.emailid?.trim().toLowerCase() === emailid.trim().toLowerCase()
        );
      }
    });
  }
  cancelOrder(orderid: number): void {
    this.os.cancelOrder(orderid).subscribe(updatedOrder => {
      if (updatedOrder) {
        const order = this.userOrders.find(o => o.orderid === orderid);
        if (order) order.status = 'Cancelled';  // UI मध्ये instant update
      }
      alert("Order cancelled successfully!");
    }, error => {
      console.error("Cancel failed", error);
    });
  }
}


