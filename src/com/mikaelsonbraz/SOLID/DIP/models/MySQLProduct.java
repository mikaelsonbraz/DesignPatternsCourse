package com.mikaelsonbraz.SOLID.DIP.models;

public class MySQLProduct implements DbProduct{

    public String getProductById(int productId){
        return "MySQL: Exibindo dados do produto com Id " + productId;
    }
}
