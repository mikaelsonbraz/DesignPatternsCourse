package com.mikaelsonbraz.SOLID.SRP;

public class SingleResponsabilityPrinciple {

    /*
    O S do acronimo SOLID recomenda a criação de classes e metodos enxutos, com apenas uma responsabilidade
    evitar GOD CLASSES, não ter classes infladas, dividir a responsabilidade fazendo com que cada classe seja
    especialista em apenas uma funcionalidade.
     */

    public static void main(String[] args) {

    }

    /*
    Nessa classe temos apenas um CRUD, por isso seguindo o padrão SRP do SOLID não devemos fazer nada além
    do que é nececssário para o CRUD funcionar.
     */

    public void addClient(){

    }

    public void listClient(){

    }

    public void updateClient(){

    }

    public void deleteClient(){

    }

    /*
    notifyClient serve pra notificar clientes, não é uma operação CRUD, então esse método não deveria estar aqui,
    então criarei um subpacote chamado utilities para abrigar métodos desse tipo.
    public void notifyClient(){
    }
    */
}
