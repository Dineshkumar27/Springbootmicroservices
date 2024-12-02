package com.example.springapplicaiton.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.springapplicaiton.Payment")
public class SpringPaymentConfig {

//    @Bean
//    @Primary
//    public IPayment creditCard(){
//        return new CreditcardPayment();
//    }
//
//    @Bean
//    public IPayment debitCard(){
//        return new DebitcardPayment();
//    }
//    @Bean
//    public PaymentService paymentService(@Qualifier("debitCard") IPayment payment){
//        return new PaymentService(payment);
//    }


}
