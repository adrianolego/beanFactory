package com.adriano.beanFactory.factory;

import com.adriano.beanFactory.config.ApplicationBeansConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFactory {

    private ApplicationContext context;

    public BeanFactory(){
        context = new AnnotationConfigApplicationContext(ApplicationBeansConfig.class);
    }

    public ApplicationContext getContext(){
        return context;
    }
}
