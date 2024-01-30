package AbstractFactory.factories;

import AbstractFactory.boats.IBoats;

public interface IITransportFactory {

    IBoats createTransportBoats();
    IBoats createTransportShips();

}
