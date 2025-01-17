package com.learning.main;

import com.learning.beans.Vehicle;
import com.learning.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.setName("Audi 9");
        System.out.println(vehicle.getName());

        //initialization of spring context
        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        //defining type of bean
        Vehicle veh=context.getBean(Vehicle.class);
        System.out.println(veh.getName());


        String hello=context.getBean(String.class);
        System.out.println(hello);

        Integer num=context.getBean(Integer.class);
        System.out.println(num);



    }
}
