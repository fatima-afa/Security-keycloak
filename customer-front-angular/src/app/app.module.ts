import {APP_INITIALIZER, NgModule} from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomersComponent } from './customers/customers.component';
import { ProductsComponent } from './products/products.component';
import {HttpClientModule} from "@angular/common/http";
import {KeycloakAngularModule, KeycloakService} from "keycloak-angular";

function initializeKeyclaok(keyclaok: KeycloakService){
  return()=>
    keyclaok.init({
      config: {
        url: 'http://localhost:9090/auth',
        realm: 'glsid-realm',
        clientId: 'glsid-angular-client'
      },
      initOptions: {
        onLoad: "check-sso",
        silentCheckSsoRedirectUri:
        window.location.origin + '/assets/silent-check-sso.html'
      }
    });
}
@NgModule({
  declarations: [
    AppComponent,
    CustomersComponent,
    ProductsComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    KeycloakAngularModule
  ],
  providers: [
    {provide : APP_INITIALIZER, deps : [KeycloakService], useFactory : initializeKeyclaok, multi : true}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
