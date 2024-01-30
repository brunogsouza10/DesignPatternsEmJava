package uber;

public class Motorcycle implements Vehicle{

    @Override
    public void startRoute() {
        System.out.println("Iniciando a entrega...");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a carga...");
    }
}
