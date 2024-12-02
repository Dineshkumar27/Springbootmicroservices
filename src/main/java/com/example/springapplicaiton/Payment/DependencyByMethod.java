package com.example.springapplicaiton.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyByMethod {

    //setter injection
    private IPayment iPayment;
    @Autowired
    public void setIpayment(IPayment iPayment){
        this.iPayment=iPayment;
    }

    public void getBillDetails(){
        System.out.println("Getting the payment details via "+iPayment);
        iPayment.makePayment();
        iPayment.getPaymentDetails();

    }

}
