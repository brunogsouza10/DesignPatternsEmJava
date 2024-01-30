package AbstractFactory.app;

import AbstractFactory.boats.FishBoat;
import AbstractFactory.boats.IBoats;
import AbstractFactory.factories.IITransportFactory;
import AbstractFactory.factories.ITransportFactory;

public class Application2 {
    private IBoats boats;
    private IBoats ships;
    public Application2(IITransportFactory factory2){
        boats = factory2.createTransportBoats();
        ships = factory2.createTransportShips();

    }

    public void startRoute(){
        boats.startRoute();
        ships.startRoute();


    }


}

