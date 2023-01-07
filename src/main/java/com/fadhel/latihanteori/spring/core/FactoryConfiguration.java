package com.fadhel.latihanteori.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.fadhel.latihanteori.spring.core.factory.PaymentGatewayClientFactoryBean;

@Configuration
@Import({
    PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}
