package com.learning.main;

import com.learning.beans.Vehicle;
import com.learning.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    public static void main(String[] args) {
            //initialization of spring context
        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        //defining type of bean
        //solution to NoUniqueBeanDefinitionException(vehicle2 -same name as @Bean method
        Vehicle veh=context.getBean("vehicle2",Vehicle.class);
        System.out.println("Bean using name "+ veh.getName());


        //custom name to bean
        Vehicle veh1=context.getBean("audi", Vehicle.class);
        System.out.println("Custom name of "+veh1.getName());


//@Primary bean annotation
        Vehicle veh2 =context.getBean(Vehicle.class);
        System.out.println("@Primary Bean "+ veh2.getName());

    }
}
