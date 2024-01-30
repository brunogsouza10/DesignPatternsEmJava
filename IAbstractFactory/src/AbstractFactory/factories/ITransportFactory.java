package AbstractFactory.factories;

import AbstractFactory.aircrafts.IAircraft;
import AbstractFactory.landvehicles.ILandVehicle;

public interface ITransportFactory {

    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();



}
