package ws;

import metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService( name = "banque" )
public class BanqueService {

    @WebMethod(operationName = "getCompteById")
    public Compte getCompte(@WebParam( name = "id" ) int code) {
        return new Compte(code, Math.random()*100000, new Date());
    }

    @WebMethod
    public List<Compte> getListCompte() {
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1, Math.random()*100000, new Date()));
        comptes.add(new Compte(2, Math.random()*100000, new Date()));
        comptes.add(new Compte(3, Math.random()*100000, new Date()));
        return comptes;
    }

    @WebMethod
    public double getSolde(@WebParam int code) {
        return new Compte(code, Math.random()*100000, new Date()).getSolde();
    }

    @WebMethod
    public double conversion(@WebParam double montant) {
        System.out.println("Méthode conversion appelée");


        return montant*20;
    }
}
