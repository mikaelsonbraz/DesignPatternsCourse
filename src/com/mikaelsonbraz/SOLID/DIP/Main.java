package com.mikaelsonbraz.SOLID.DIP;

import com.mikaelsonbraz.SOLID.DIP.payment.Payment;

public class Main {

    public static void main(String[] args) {

        Payment payment = new Payment();

        payment.pay(200);

        /*
        O princípio da Inversão de Dependência trata de desacoplamentos, fazendo que classes de baixo nível e classes
        de alto nível não dependam uma da outra e sim de abstrações
         */
    }
}
