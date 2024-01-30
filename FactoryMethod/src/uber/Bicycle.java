package uber;

public class Bicycle implements Vehicle{
    @Override
    public void startRoute() {
        System.out.println("Iniciando o delivery...");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a comida...");
    }
}
