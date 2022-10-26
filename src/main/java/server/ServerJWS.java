package server;

import ws.BanqueService;

import javax.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8084/";
        System.out.println("Service Banque");
        Endpoint.publish(url, new BanqueService());
        System.out.println("Déployé sur " + url);
    }
}
