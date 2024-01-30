package AbstractFactory.boats;

public class Ship implements IBoats{
    @Override
    public void startRoute() {
        getCargo();
        wind();
        System.out.println("Iniciando o cruzeiro transatlântico...");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo!");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 10km/h! Ligar os motores!");
    }
}
