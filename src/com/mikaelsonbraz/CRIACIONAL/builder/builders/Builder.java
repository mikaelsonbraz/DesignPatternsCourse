package com.mikaelsonbraz.CRIACIONAL.builder.builders;

import com.mikaelsonbraz.CRIACIONAL.builder.components.CarType;
import com.mikaelsonbraz.CRIACIONAL.builder.components.Engine;
import com.mikaelsonbraz.CRIACIONAL.builder.components.Transmission;

public interface Builder {

    void setCarType(CarType carType);
    void setSeats(int seats);
    void setColor(String color);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);

}
