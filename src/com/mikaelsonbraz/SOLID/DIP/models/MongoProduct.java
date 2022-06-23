package com.mikaelsonbraz.SOLID.DIP.models;

public class MongoProduct implements DbProduct{
    @Override
    public String getProductById(int productId) {
        return "MongoDB: Exibindo dados do produto com Id " + productId;
    }
}
