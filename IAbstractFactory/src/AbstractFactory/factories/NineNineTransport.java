package AbstractFactory.factories;

import AbstractFactory.aircrafts.Helicopter;
import AbstractFactory.aircrafts.IAircraft;
import AbstractFactory.landvehicles.ILandVehicle;
import AbstractFactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

}
