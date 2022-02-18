package com.adriano.beanFactory.config;

import com.adriano.beanFactory.service.ClassRoomService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeansConfig {

    @Bean(name="classRoomService")
    public ClassRoomService getClassRoomService(){
        return new ClassRoomService();
    }

}
