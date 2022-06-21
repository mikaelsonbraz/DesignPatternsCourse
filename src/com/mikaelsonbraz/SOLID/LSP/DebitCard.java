package com.mikaelsonbraz.SOLID.LSP;

public class DebitCard extends Card{

    @Override
    public void validate() throws Exception {
        System.out.println("Verificando saldo...");
        System.out.println("Saldo Disponível");
    }
}
