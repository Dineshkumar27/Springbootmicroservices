package com.example.springapplicaiton.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
public class DependencyByField {

   @Autowired
    private IPayment iPayment;

    public void getBillDetails(){
        System.out.println("Getting the payment details via "+iPayment);
        iPayment.makePayment();
        iPayment.getPaymentDetails();

    }
}
