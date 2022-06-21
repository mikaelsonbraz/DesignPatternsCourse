package com.mikaelsonbraz.SOLID.LSP;

public interface PaymentInstrument {

    void validate() throws Exception;
    void collectPayment();

}
