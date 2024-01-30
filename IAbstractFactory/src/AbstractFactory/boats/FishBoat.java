package AbstractFactory.boats;

public class FishBoat implements IBoats{
    @Override
    public void startRoute() {
        getCargo();
        wind();
        System.out.println("Remando do canal da Barra para o mar...");
    }
    @Override
    public void getCargo() {
        System.out.println("Varas, iscas e redes preparadas...");
    }

    @Override
    public void wind() {
        System.out.println("Vento sul contra o costão do Santinho...");
    }


}
