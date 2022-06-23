package com.mikaelsonbraz.SOLID.DIP.factory;

import com.mikaelsonbraz.SOLID.DIP.models.DbENUM;
import com.mikaelsonbraz.SOLID.DIP.models.DbProduct;
import com.mikaelsonbraz.SOLID.DIP.models.MongoProduct;
import com.mikaelsonbraz.SOLID.DIP.models.MySQLProduct;

public class DbProductFactory {

    public static DbProduct create(DbENUM type) {
        if (type == DbENUM.MYSQL) {
            return new MySQLProduct();
        } else if (type == DbENUM.MONGODB) {
            return new MongoProduct();
        }
        return null;
    }
}
