package com.example.springcoreproject2_3ReplacingXmlWithAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public Mango getMango() {
        Mango mango = new Mango("Yellow");
        return mango;
    }
    @Bean
    public Fruit getFruit() {
        Fruit fruit = new Fruit(1, getMango());
        return fruit;
    }
}
