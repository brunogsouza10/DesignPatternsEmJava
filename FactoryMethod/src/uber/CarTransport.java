package uber;

public class CarTransport extends Transport{
    @Override
    protected Vehicle createTransport() {
        return new Car();
    }
}
