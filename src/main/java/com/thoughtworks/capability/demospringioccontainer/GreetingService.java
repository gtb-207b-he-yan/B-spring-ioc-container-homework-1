package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Configuration
public class GreetingService implements ApplicationContextAware {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    String sayHi() {
        return "hello world";
    }

    @Override
    public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.getBean(GreetingFactory.class));
        System.out.println(applicationContext.getBean(GreetingFactory.class));
    }
}
