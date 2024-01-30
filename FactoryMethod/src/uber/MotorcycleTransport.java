package uber;

public class MotorcycleTransport extends Transport{
    @Override
    protected Vehicle createTransport() {
        return new Motorcycle();
    }
}
