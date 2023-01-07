package com.fadhel.latihanteori.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.fadhel.latihanteori.spring.core.configuration.BarConfiguration;
import com.fadhel.latihanteori.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}
