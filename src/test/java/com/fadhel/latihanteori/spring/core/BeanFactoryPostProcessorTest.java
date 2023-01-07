package com.fadhel.latihanteori.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.fadhel.latihanteori.spring.core.data.Foo;
import com.fadhel.latihanteori.spring.core.processor.FooBeanFactoryPostProcessor;

public class BeanFactoryPostProcessorTest {

  @Configuration
  @Import(FooBeanFactoryPostProcessor.class)
  public static class TestConfiguration {

  }

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testBeanFactoryPostProcessor() {

    Foo foo = applicationContext.getBean(Foo.class);
    Assertions.assertNotNull(foo);

  }
}