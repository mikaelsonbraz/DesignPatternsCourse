package com.mikaelsonbraz.ESTRUTURAL.adapter.adapters;

import com.mikaelsonbraz.ESTRUTURAL.adapter.mercadoPago.MercadoPago;
import com.mikaelsonbraz.ESTRUTURAL.adapter.paypal.PaypalPayments;
import com.mikaelsonbraz.ESTRUTURAL.adapter.utils.Token;

public class MercadoPagoAdapter implements PaypalPayments {

    private Token token;
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o Mercado Pago utilizando os métodos padrões do Paypal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.mercadoPago.pagar();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.receber();
    }
}
