import { Component, OnInit } from '@angular/core';
import {AuthService, FacebookLoginProvider, GoogleLoginProvider, SocialUser} from 'angularx-social-login';
import {Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  title = 'lending-app';
  username: string;
  password: string;
  showSpinner: boolean;

  user: SocialUser;
  loggedIn: boolean;

  constructor(private authService: AuthService, private router : Router) { }

  ngOnInit() {
    this.authService.authState.subscribe((user) => {
      this.user = user;
      this.loggedIn = user != null;
    });
  }

  signInWithGoogle(): void {
    this.authService.signIn(GoogleLoginProvider.PROVIDER_ID);
  }

  signInWithFB(): void {
    this.authService.signIn(FacebookLoginProvider.PROVIDER_ID);
    if (this.loggedIn === true) {
      this.router.navigateByUrl('/user');
    }
  }

  signOut(): void {
    this.authService.signOut();
  }

  login() {
    // place for login method
  }

}
