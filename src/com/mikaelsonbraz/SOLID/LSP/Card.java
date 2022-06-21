package com.mikaelsonbraz.SOLID.LSP;

abstract public class Card implements PaymentInstrument{

    @Override
    public void validate() throws Exception {
        // Basic validation
    }

    @Override
    public void collectPayment() {
        System.out.println("Payment completed...");
    }
}
