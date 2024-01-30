import AbstractFactory.app.Application;
import AbstractFactory.app.Application2;
import AbstractFactory.factories.*;



public class Main {

    public static void configureApplication() {
        ITransportFactory factory = null;
        IITransportFactory factory2 = null;

        String company = "mrv";

        if (company.equals("uber")) {
            factory = new UberTransport();
        } else if (company.equals("99")) {
            factory = new NineNineTransport();
        } else {
            factory2 = new BoatTransport();
        }

        if (factory != null) {
            Application app = new Application(factory);
            app.startRoute();
        }

        if (factory2 != null) {
            Application2 app2 = new Application2(factory2);
            app2.startRoute();
        }

       }


    public static void main(String[] args) {
        configureApplication();
    }
}
