package uber;

public class Car implements Vehicle{

    @Override
    public void startRoute() {
        System.out.println("Iniciando o trajeto...");
    }

    @Override
    public void getCargo() {

        System.out.println("Pegamos os passageiros, estamos prontos!");
    }
}
