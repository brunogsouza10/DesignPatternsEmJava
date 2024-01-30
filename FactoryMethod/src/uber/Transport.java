package uber;

public abstract class Transport{

// exemplo de factory method

   public void startTransport(){
    Vehicle vehicle = createTransport(); // objeto sem new
    vehicle.startRoute(); // chama o método startRoute da interface vehicle
    vehicle.getCargo();
   }

   protected abstract Vehicle createTransport();


}
