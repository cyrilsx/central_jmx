import {BrowserModule} from "@angular/platform-browser";
import {NgModule} from "@angular/core";

import {AppComponent} from "./app.component";
import {LoginComponent} from "./login.component";
import {
  MdAutocompleteModule,
  MdCardModule,
  MdIconModule,
  MdInputModule,
  MdListModule,
  MdMenuModule,
  MdTabsModule,
  MdToolbarModule
} from "@angular/material";
import {ToolsComponent} from "./tools.component";
import {HttpModule} from "@angular/http";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent, LoginComponent, ToolsComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MdCardModule,
    MdAutocompleteModule,
    MdToolbarModule,
    MdIconModule,
    MdInputModule,
    FormsModule,
    ReactiveFormsModule,
    MdTabsModule,
    MdMenuModule,
    HttpModule,
    MdListModule
  ],
  schemas: [],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
