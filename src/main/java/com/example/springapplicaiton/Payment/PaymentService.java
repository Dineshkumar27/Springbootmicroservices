package com.example.springapplicaiton.Payment;

public class PaymentService {

    private IPayment paymentMode;

    public PaymentService(IPayment paymentMode) {
        this.paymentMode = paymentMode;
    }

    public void getBillDetails(){
        System.out.println("Getting the payment details via "+paymentMode);
        paymentMode.makePayment();
        paymentMode.getPaymentDetails();

    }

}
