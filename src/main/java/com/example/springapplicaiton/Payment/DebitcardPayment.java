package com.example.springapplicaiton.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DebitcardPayment implements IPayment {
    public void makePayment(){
        System.out.println("Payment Via Debit Card");
    }

    public void getPaymentDetails(){
        System.out.println("Sharing the details of Debit Card Payment");
    }
}
