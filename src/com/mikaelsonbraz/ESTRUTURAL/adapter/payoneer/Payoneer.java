package com.mikaelsonbraz.ESTRUTURAL.adapter.payoneer;

import com.mikaelsonbraz.ESTRUTURAL.adapter.utils.Token;

public class Payoneer implements PayoneerPayments{

    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        this.token = authToken();
        System.out.println("PAYONEER - Pagamento efetuado com sucesso.");
    }

    @Override
    public void receivePayment() {
        System.out.println("PAYONEER - Pagamento recebido com sucessso.");
    }
}
