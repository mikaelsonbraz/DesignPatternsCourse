package com.mikaelsonbraz.ESTRUTURAL.adapter.adapters;

import com.mikaelsonbraz.ESTRUTURAL.adapter.payoneer.Payoneer;
import com.mikaelsonbraz.ESTRUTURAL.adapter.paypal.PaypalPayments;
import com.mikaelsonbraz.ESTRUTURAL.adapter.utils.Token;

public class PayoneerAdapter implements PaypalPayments {

    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payoneer utilizando os métodos padrões do Paypal.");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.receivePayment();
    }
}
