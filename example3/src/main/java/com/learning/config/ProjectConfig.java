package com.learning.config;

import com.learning.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name="audi")
    Vehicle vehicle()
    {
        var veh=new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }
    @Bean
    Vehicle vehicle1()
    {
        var veh=new Vehicle();
        veh.setName("Honda");
        return veh;
    }
@Primary
    @Bean
    Vehicle vehicle2()
    {
        var veh=new Vehicle();
        veh.setName("Mercedes");
        return veh;
    }



}

//    @Bean
//    String hello(){
//        return "hello";
//}
//@Bean
//Integer number()
//{
//    return 16;
//}
//}
