package com.mikaelsonbraz.COMPORTAMENTAL.chainOfResponsability.middlewares;

public class CheckPermissionMiddleware extends Middleware{

    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@admin.com")){
            System.out.println("Bem vindo, administrador " + email);
            return true;
        }
        System.out.println("Bem vindo");
        return checkNext(email, password);
    }
}
