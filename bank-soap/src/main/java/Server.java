import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/", new BankService());
        System.out.println("Server started at port: 8080");
    }
}
