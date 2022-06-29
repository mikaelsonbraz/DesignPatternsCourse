package com.mikaelsonbraz.COMPORTAMENTAL.chainOfResponsability.server;

import com.mikaelsonbraz.COMPORTAMENTAL.chainOfResponsability.middlewares.Middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware){
        this.middleware = middleware;
    }

    public boolean login(String email, String password){
        if (middleware.check(email, password)){
            System.out.println("Usuário autenticado com sucesso.");
            return true;
        }
        return false;
    }

    public void registerUser(String email, String password){
        this.users.put(email, password);
    }

    public boolean hasEmail(String email){
        return this.users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password){
        return this.users.get(email).equals(password);
    }
}
