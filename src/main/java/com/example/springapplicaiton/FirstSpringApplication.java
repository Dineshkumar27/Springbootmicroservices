package com.example.springapplicaiton;

import com.example.springapplicaiton.model.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FirstSpringApplication {
    public static void main(String[] args) {
        var ctx=new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);

        System.out.println(ctx.getBean("firstName"));
        System.out.println(ctx.getBean("employeeNumber"));

//        System.out.println(ctx.getBean("employee"));//calling by Bean name
//        System.out.println(ctx.getBean(Employee.class));//calling by Bean by its class Name
        System.out.println(ctx.getBean("emp"));//calling by bean using customized name
        System.out.println(ctx.getBean("company"));

    }
}
