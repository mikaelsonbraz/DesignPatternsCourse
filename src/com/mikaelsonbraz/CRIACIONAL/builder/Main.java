package com.mikaelsonbraz.CRIACIONAL.builder;

import com.mikaelsonbraz.CRIACIONAL.builder.builders.CarBuilder;
import com.mikaelsonbraz.CRIACIONAL.builder.builders.TruckBuilder;
import com.mikaelsonbraz.CRIACIONAL.builder.cars.Car;
import com.mikaelsonbraz.CRIACIONAL.builder.cars.Truck;
import com.mikaelsonbraz.CRIACIONAL.builder.director.Director;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        //Criando o carro
        CarBuilder carBuilder = new CarBuilder();
        director.constructSedanCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        //Criando o caminhão
        TruckBuilder truckBuilder = new TruckBuilder();
        director.contructTruck(truckBuilder);
        Truck truck = truckBuilder.getResult();
        System.out.println(truck.result());

        //DESAFIO: Criando um carro esportivo
        CarBuilder carBuilderSport = new CarBuilder();
        director.constructSportsCar(carBuilderSport);
        Car sportCar = carBuilderSport.getResult();
        System.out.println(sportCar.getCarType() + " produzido com sucesso!");
    }
}
