import {Component, OnInit} from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  constructor( private router: Router) {
  }

  login() {
    this.router.navigateByUrl('/user');
  }

  myFacebookLogin() {
    FB.login(response => {
      if (response.authResponse) {
          this.router.navigateByUrl('/user');
      } else {

        console.log('Nie zalogowano');
      }
    }, {scope: 'user_location'});

  }

}
