import {Router, RouterModule, Routes} from '@angular/router';
import {  NgModule } from '@angular/core';
import { LoginComponent } from '../login/login.component';
import { UserComponent } from '../user/user.component';

const appRoutes: Routes = [
  { path: '', component: LoginComponent},
  { path: 'login', component: LoginComponent},
  { path: 'user', component: UserComponent}
];

@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }
