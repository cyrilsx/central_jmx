import { Component } from '@angular/core';
import {DomSanitizer} from "@angular/platform-browser";
import {MdIconRegistry} from "@angular/material";
import {FormControl} from "@angular/forms";

import 'rxjs/add/operator/startWith';
import 'rxjs/add/operator/map';


@Component({
  selector: 'app-tools',
  templateUrl: './tools.component.html',
  styleUrls: ['./tools.component.scss']
})
export class ToolsComponent {
  searchControl: FormControl;
  filteredApp: any;
  title = "JMX Stuff";

  applications = [
    "test1", "test2"
  ];

  constructor(iconRegistry: MdIconRegistry, sanitizer: DomSanitizer) {
    iconRegistry.addSvgIcon(
      'menu',
      sanitizer.bypassSecurityTrustResourceUrl('assets/icon/190-menu.svg'));
    this.searchControl = new FormControl();
    this.filteredApp = this.searchControl.valueChanges
      .startWith(null)
      .map(name => this.filterStates(name));
  }


  filterStates(val: string) {
    return val ? this.applications.filter(s => s.toLowerCase().indexOf(val.toLowerCase()) === 0)
      : this.applications;
  }
}
