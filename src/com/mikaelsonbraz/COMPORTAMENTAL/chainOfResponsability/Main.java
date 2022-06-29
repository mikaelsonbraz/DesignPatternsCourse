package com.mikaelsonbraz.COMPORTAMENTAL.chainOfResponsability;

import com.mikaelsonbraz.COMPORTAMENTAL.chainOfResponsability.middlewares.CheckPermissionMiddleware;
import com.mikaelsonbraz.COMPORTAMENTAL.chainOfResponsability.middlewares.CheckUserMiddleware;
import com.mikaelsonbraz.COMPORTAMENTAL.chainOfResponsability.middlewares.Middleware;
import com.mikaelsonbraz.COMPORTAMENTAL.chainOfResponsability.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init(){
        server = new Server();
        server.registerUser("lalala@lalala.com", "123123");
        server.registerUser("admin@admin.com", "123456");
        server.registerUser("abc@abc.com", "abcabc");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {

        init();

        boolean done;

        do {
            System.out.println("Digite o email: ");
            String email = bufferedReader.readLine();
            System.out.println("Digite sua senha: ");
            String password = bufferedReader.readLine();
            done = server.login(email, password);
        } while (!done);

    }
}
