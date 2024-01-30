package AbstractFactory.factories;

import AbstractFactory.aircrafts.Airplane;
import AbstractFactory.aircrafts.IAircraft;
import AbstractFactory.landvehicles.Car;
import AbstractFactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    }


