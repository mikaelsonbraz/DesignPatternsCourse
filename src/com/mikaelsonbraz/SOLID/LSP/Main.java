package com.mikaelsonbraz.SOLID.LSP;

public class Main {

    public static void main(String[] args) throws Exception {

        /*
        O principio de substituição de Liskov diz que independente da instância que implementa uma interface
        os métodos devem sempre funcionar porrquê os comportamentos deles devem condizerr com o que fala a classe pai
         */

        //CreditCard card = new CreditCard();
        //DebitCard card = new DebitCard();
        RewardsCard card = new RewardsCard();

        card.validate();
        card.collectPayment();

        /*
        Parece pato, faz quack como pato, nada como pato, tem bico de pato - Então é um pato
        Se forr isso tudo porém precise de bateria então não é um pato
         */
    }
}
