package com.example.springapplicaiton;

import com.example.springapplicaiton.Payment.CreditcardPayment;
import com.example.springapplicaiton.Payment.DebitcardPayment;
import com.example.springapplicaiton.Payment.PaymentService;

public class LooselyCoupling {
    public static void main(String[] args) {
        var creditcardPayment=new CreditcardPayment();
        var paymentService=new PaymentService(creditcardPayment);
        paymentService.getBillDetails();

        var debitcardPayment=new DebitcardPayment();
        paymentService=new PaymentService(debitcardPayment);
        paymentService.getBillDetails();
    }
}
