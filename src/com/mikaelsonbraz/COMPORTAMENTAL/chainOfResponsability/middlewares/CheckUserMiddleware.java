package com.mikaelsonbraz.COMPORTAMENTAL.chainOfResponsability.middlewares;

import com.mikaelsonbraz.COMPORTAMENTAL.chainOfResponsability.server.Server;

public class CheckUserMiddleware extends Middleware{

    private Server server;

    public CheckUserMiddleware(Server server){
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!this.server.hasEmail(email)){
            System.out.println("Email inválido!");
            return false;
        }

        if (!this.server.isValidPassword(email, password)){
            System.out.println("Email e/ou senha inválidos!");
            return false;
        }
        return checkNext(email, password);
    }
}
