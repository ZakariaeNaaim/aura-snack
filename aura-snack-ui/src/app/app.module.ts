import { NgModule } from '@angular/core';
import { HashLocationStrategy, LocationStrategy, PathLocationStrategy } from '@angular/common';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { NotfoundComponent } from './aura-snack/components/notfound/notfound.component';
import { ProductService } from './aura-snack/service/product.service';
import { CountryService } from './aura-snack/service/country.service';
import { CustomerService } from './aura-snack/service/customer.service';
import { EventService } from './aura-snack/service/event.service';
import { IconService } from './aura-snack/service/icon.service';
import { NodeService } from './aura-snack/service/node.service';
import { PhotoService } from './aura-snack/service/photo.service';
import { AppLayoutModule } from './layout/app.layout.module';

@NgModule({
    declarations: [AppComponent, NotfoundComponent],
    imports: [AppRoutingModule, AppLayoutModule],
    providers: [
        { provide: LocationStrategy, useClass: PathLocationStrategy },
        CountryService, CustomerService, EventService, IconService, NodeService,
        PhotoService, ProductService
    ],
    bootstrap: [AppComponent],
})
export class AppModule {}
