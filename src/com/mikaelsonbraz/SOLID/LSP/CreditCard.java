package com.mikaelsonbraz.SOLID.LSP;

public class CreditCard extends Card{

    @Override
    public void validate() throws Exception {
        System.out.println("Validando limite...");
        System.out.println("Limite OK");
    }
}
