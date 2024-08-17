import { Routes } from '@angular/router';
import { CommandsComponent } from './commands/commands.component';
import { StockComponent } from './stock/stock.component';
import { UsersComponent } from './users/users.component';

export const routes: Routes = [
  { path: 'commands', loadComponent: () => import('./commands/commands.component').then(m => m.CommandsComponent) },
  { path: 'stock', loadComponent: () => import('./stock/stock.component').then(m => m.StockComponent) },
  { path: 'users', loadComponent: () => import('./users/users.component').then(m => m.UsersComponent) },
  { path: '', redirectTo: '/commands', pathMatch: 'full' }
];
