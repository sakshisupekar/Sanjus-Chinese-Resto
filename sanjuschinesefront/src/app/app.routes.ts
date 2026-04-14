import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { RegistrationComponent } from './registration/registration.component';
import { MenuComponent } from './menu/menu.component';
import { OrdersComponent } from './orders/orders.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { AddmenuComponent } from './addmenu/addmenu.component';
import { ViewregistrationComponent } from './viewregistration/viewregistration.component';
import { ViewordersComponent } from './vieworders/vieworders.component';
import { ViewfeedbackComponent } from './viewfeedback/viewfeedback.component';
import { LoginComponent } from './login/login.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { ViewcontactComponent } from './viewcontact/viewcontact.component';
import { MyordersComponent } from './myorders/myorders.component';

export const routes: Routes = [
    {path:'',component:HomeComponent},
    {path:'registration',component:RegistrationComponent},
    {path:'menu',component:MenuComponent},
    {path:'orders/:mnm/:mp',component:OrdersComponent},
    {path:'adminlogin',component:AdminloginComponent},
    {path:'feedback',component:FeedbackComponent},
    {path:'addmenu',component:AddmenuComponent},
    {path:'viewregistration',component:ViewregistrationComponent},
    {path:'vieworders',component:ViewordersComponent},
    {path:'viewfeedback',component:ViewfeedbackComponent},
    {path:'viewcontact',component:ViewcontactComponent},
    {path:'login',component:LoginComponent},
    {path:'about',component:AboutComponent},
    {path:'contact',component:ContactComponent},
    {path:'myorders',component:MyordersComponent}
];
