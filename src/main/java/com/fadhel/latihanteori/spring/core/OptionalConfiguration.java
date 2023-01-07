package com.fadhel.latihanteori.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.fadhel.latihanteori.spring.core.data.Bar;
import com.fadhel.latihanteori.spring.core.data.Foo;
import com.fadhel.latihanteori.spring.core.data.FooBar;

import java.util.Optional;

@Configuration
public class OptionalConfiguration {

  @Bean
  public Foo foo(){
    return new Foo();
  }

  @Bean
  public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar){
    return new FooBar(foo.orElse(null), bar.orElse(null));
  }

}
