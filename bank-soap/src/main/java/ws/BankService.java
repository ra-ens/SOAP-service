package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "bankWS")
public class BankService {

    private List<Compte> compteList = new ArrayList<>();

    @WebMethod(operationName = "convert")
    public double conversion(double montant) {
        return montant * 11;
    }

    @WebMethod
    public Compte getCompte(int code) {
        for(Compte compte : compteList) {
            if (compte.getCode() == code)
                return compte;
        }
        return null;
    }

    @WebMethod
    public List<Compte> getComptes() {
        return compteList;
    }
}
