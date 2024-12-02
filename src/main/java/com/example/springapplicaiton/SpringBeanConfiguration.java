package com.example.springapplicaiton;

import com.example.springapplicaiton.model.Company;
import com.example.springapplicaiton.model.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringBeanConfiguration {

    @Bean
    public String firstName(){//firstName is the Bean name
        return "Jagan";
    }

    @Bean
    public int employeeNumber(){//employeeNumber is the Bean name
        return 13;
    }
    @Bean(name="emp")
    public Employee employee(@Qualifier("company2") Company company){
        return new Employee("Jagan",13,company);
    }
    @Bean
    public Company company(){
        return new Company("Comcast",127);
    }

    @Bean
    public Company company2(){
        return new Company("Company2",128);
    }
}
