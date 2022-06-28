package com.mikaelsonbraz.ESTRUTURAL.adapter.payoneer;

import com.mikaelsonbraz.ESTRUTURAL.adapter.utils.Token;

public interface PayoneerPayments {

    Token authToken();
    void sendPayment();
    void receivePayment();

}
