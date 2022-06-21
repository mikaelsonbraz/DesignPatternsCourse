package com.mikaelsonbraz.SOLID.LSP;

public class RewardsCard implements PaymentInstrument{

    @Override
    public void validate() throws Exception {
        System.out.println("Limite OK!");
        System.out.println("Rewards OK!");
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado com sucesso");
        System.out.println("Pontuação creditada no Programa Rewards!");
    }
}
