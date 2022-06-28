package com.mikaelsonbraz.ESTRUTURAL.adapter.mercadoPago;

import com.mikaelsonbraz.ESTRUTURAL.adapter.utils.Token;

public class MercadoPago implements MercadoPagoPayments{

    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void pagar() {
        this.token = authToken();
        System.out.println("MERCADO PAGO - Pagamento efetuado com sucesso.");
    }

    @Override
    public void receber() {
        System.out.println("MERCADO PAGO - Pagamento recebido com sucesso.");
    }
}
