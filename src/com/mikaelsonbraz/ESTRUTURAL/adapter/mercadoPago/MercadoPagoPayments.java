package com.mikaelsonbraz.ESTRUTURAL.adapter.mercadoPago;

import com.mikaelsonbraz.ESTRUTURAL.adapter.utils.Token;

public interface MercadoPagoPayments {

    Token authToken();
    void pagar();
    void receber();
}
