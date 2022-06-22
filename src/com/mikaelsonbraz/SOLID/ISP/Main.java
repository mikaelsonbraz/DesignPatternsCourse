package com.mikaelsonbraz.SOLID.ISP;

import com.mikaelsonbraz.SOLID.ISP.models.Car;
import com.mikaelsonbraz.SOLID.ISP.models.Motorcycle;

public class Main {

    public static void main(String[] args) {

        Car carro = new Car("Azul", 2020, 1.6, 4);
        System.out.println("\n");
        Motorcycle moto = new Motorcycle("Preta", 2022, 300);

        /*
        O Interface Segregation Principle fala que devemos desinflar as interfaces (ou classes abstratas)
        o máximo possível para que classes não sejam obrigadas a implementar métodos que não lhes convém.

        No exemplo criamos uma interfaace pai "Vehicle" e outras duas filhas "VehicleCar" e "VehicleMotorcycle"
        cada uma contendo seus próprios métodos e evitando que a classe Car precise implementar os métodos
        necessários pela classe Motorcycle e vice-versa
         */
    }


}
