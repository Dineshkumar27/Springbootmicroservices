package com.example.springapplicaiton;

import com.example.springapplicaiton.Payment.CreditcardPayment;
import com.example.springapplicaiton.Payment.DebitcardPayment;
import com.example.springapplicaiton.Payment.PaymentService;

public class TightcouplingDemo {

    public static void main(String[] args) {
        //creating object for CreditCardPayment class
        var creditcardPayment=new CreditcardPayment();
        var paymentService=new PaymentService(creditcardPayment);
        paymentService.getBillDetails();
    }
}
