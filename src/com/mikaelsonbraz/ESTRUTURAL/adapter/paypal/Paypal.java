package com.mikaelsonbraz.ESTRUTURAL.adapter.paypal;

import com.mikaelsonbraz.ESTRUTURAL.adapter.utils.Token;

public class Paypal implements PaypalPayments{

    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        System.out.println("PAYPAL - Pagamento efetuado com sucesso.");
    }

    @Override
    public void paypalReceive() {
        System.out.println("PAYPAL - Pagamento recebido com sucesso.");
    }
}
