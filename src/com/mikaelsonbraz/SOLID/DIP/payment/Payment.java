package com.mikaelsonbraz.SOLID.DIP.payment;

import com.mikaelsonbraz.SOLID.DIP.factory.DbProductFactory;
import com.mikaelsonbraz.SOLID.DIP.models.DbENUM;
import com.mikaelsonbraz.SOLID.DIP.models.DbProduct;

public class Payment {

    public void pay(int productId){
        DbProduct dbProduct = DbProductFactory.create(DbENUM.MONGODB);
        String product = dbProduct.getProductById(productId);
        System.out.println(product);
    }
}
