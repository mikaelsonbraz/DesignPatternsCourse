package com.mikaelsonbraz.ESTRUTURAL.adapter;

import com.mikaelsonbraz.ESTRUTURAL.adapter.adapters.PayoneerAdapter;
import com.mikaelsonbraz.ESTRUTURAL.adapter.payoneer.Payoneer;
import com.mikaelsonbraz.ESTRUTURAL.adapter.paypal.Paypal;
import com.mikaelsonbraz.ESTRUTURAL.adapter.paypal.PaypalPayments;

public class Main {

    public static void main(String[] args) {

        //LISKOV SUBSTITUTION

        PaypalPayments paypalPayments = new Paypal();
        //PaypalPayments paypalPayments = new PayoneerAdapter(new Payoneer());
        paypalPayments.paypalPayment();
        paypalPayments.paypalReceive();
    }
}
