package com.example.springapplicaiton.Payment;

import org.springframework.stereotype.Component;

@Component
public class CreditcardPayment implements IPayment{

    public void makePayment(){
        System.out.println("Payment Via Credit Card");
    }

    public void getPaymentDetails(){
        System.out.println("Sharing the details of Credit Card Payment");
    }
}
