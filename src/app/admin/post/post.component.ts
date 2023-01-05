import { Component } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent {
  first_name = new FormControl();
  last_name = new FormControl();
  password = new FormControl();
  confirm_password = new FormControl();
  gender = new FormControl();

  register(){
    alert("Registration Successfull.")
  }

}
