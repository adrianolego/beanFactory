package com.adriano.beanFactory.service;

import com.adriano.beanFactory.factory.BeanFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.context.ApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(MockitoJUnitRunner.class)
public class ClassRoomTest {

    @InjectMocks
    private BeanFactory beanFactory;


    @Test
    public void testGetServiceInstance() {
        ApplicationContext context = beanFactory.getContext();
        var classRoom = context.getBean(ClassRoomService.class);
        var result = classRoom.getClassroom();
        assertThat(result, is("Is Working!!"));
    }
}
