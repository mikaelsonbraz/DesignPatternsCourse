package com.mikaelsonbraz.ESTRUTURAL.adapter.paypal;

import com.mikaelsonbraz.ESTRUTURAL.adapter.utils.Token;

public interface PaypalPayments {

    Token authToken();

    void paypalPayment();
    void paypalReceive();
}
