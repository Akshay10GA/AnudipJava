import { Component } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {
  title = 'newApp';
  name = new FormControl();
  pass = new FormControl();

  login(){
    alert("logged in");
  }

}
