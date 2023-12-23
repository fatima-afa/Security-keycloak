import {Component, OnInit} from '@angular/core';
import {SecurityServiceService} from "./services/security-service.service";
import {KeycloakService} from "keycloak-angular";
import {KeycloakProfile} from "keycloak-js";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'customer-front-angular';
  public profile? :KeycloakProfile;
  constructor( public keycloakService : KeycloakService) {
  }
  ngOnInit(): void {
    if(this.keycloakService.isLoggedIn()){
      this.keycloakService.loadUserProfile().then(profile=>{
        this.profile=profile;
      });
    }

  }

  async login() {
  await this.keycloakService.login({
    redirectUri: window.location.origin
  });
  }
  logout() {
  this.keycloakService.logout("http://localhost:4200/")
  }
}
