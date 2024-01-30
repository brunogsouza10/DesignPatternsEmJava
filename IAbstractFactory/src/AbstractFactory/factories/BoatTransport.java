package AbstractFactory.factories;

import AbstractFactory.boats.FishBoat;
import AbstractFactory.boats.IBoats;
import AbstractFactory.boats.Ship;

public class BoatTransport implements IITransportFactory {
    @Override
    public IBoats createTransportBoats() {
        return new FishBoat();
    }

    @Override
    public IBoats createTransportShips() {
        return new Ship();
    }


}