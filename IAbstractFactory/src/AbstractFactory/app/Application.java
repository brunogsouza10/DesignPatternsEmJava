package AbstractFactory.app;

import AbstractFactory.aircrafts.IAircraft;
import AbstractFactory.boats.IBoats;
import AbstractFactory.factories.ITransportFactory;
import AbstractFactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;


    public Application(ITransportFactory factory){
         vehicle = factory.createTransportVehicle();
         aircraft = factory.createTransportAircraft();

    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();

    }
}
