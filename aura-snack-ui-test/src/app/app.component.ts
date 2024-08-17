import { RouterOutlet } from '@angular/router';
import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { SidebarModule } from 'primeng/sidebar';
import { ButtonModule } from 'primeng/button';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    RouterOutlet,
    RouterModule,
    SidebarModule,
    ButtonModule  ],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  visibleSidebar: boolean = false;
  darkMode: boolean = false;

  
  toggleDarkMode() {
    this.darkMode = !this.darkMode;
    const themeLink = document.getElementById('app-theme') as HTMLLinkElement;
    themeLink.href = this.darkMode ? 'node_modules/primeng/resources/themes/arya-blue/theme.css' : 'node_modules/primeng/resources/themes/saga-blue/theme.css';
  }
}
