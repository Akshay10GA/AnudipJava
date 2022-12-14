// import { NgModule } from '@angular/core';
// import { CommonModule } from '@angular/common';

// import { AdminRoutingModule } from './admin-routing.module';
// import { UserComponent } from './user/user.component';
// import { PostComponent } from './post/post.component';
// import { HomeComponent } from './home/home.component';


// @NgModule({
//   declarations: [
//     UserComponent,
//     PostComponent,
//     HomeComponent
//   ],
//   imports: [
//     CommonModule,
//     AdminRoutingModule
//   ]
// })
// export class AdminModule { }

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminRoutingModule } from './admin-routing.module';
import { UserComponent } from './user/user.component';
import { PostComponent } from './post/post.component';
import { HomeComponent } from './home/home.component';
import { AppRoutingModule } from '../app-routing.module';
import { ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    UserComponent,
    PostComponent,
    HomeComponent
  ],
  imports: [
    CommonModule,
   AppRoutingModule,
   ReactiveFormsModule
  ]
})
export class AdminModule { }