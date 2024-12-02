package com.example.springapplicaiton;

import com.example.springapplicaiton.Payment.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LooselyCoupledSpringApp {
    public static void main(String[] args) {
        var ctx=new AnnotationConfigApplicationContext(SpringPaymentConfig.class);

//        PaymentService paymentService=ctx.getBean(PaymentService.class);
//        paymentService.getBillDetails();

//        PaymentService creditCard=ctx.getBean(PaymentService.class);
//        creditCard.getBillDetails();
//
//        IPayment iPayment=  ctx.getBean("debitCard", IPayment.class);
//        iPayment.getPaymentDetails();

        var iPayment=ctx.getBean(DependencyByConstructor.class);

        iPayment.getBillDetails();



    }
}
