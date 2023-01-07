package com.fadhel.latihanteori.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.fadhel.latihanteori.spring.core.service.MerchantServiceImpl;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {

}
