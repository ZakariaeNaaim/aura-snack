package com.aura_snack.security_service.sec.services;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCustomer", types =
        Customer.class)
interface CustomerProjection extends Projection {

    Long getId();
    String getName();
    String getEmail();

}