package uber;

public class BicycleTransport extends Transport{
    @Override
    protected Vehicle createTransport() {
        return new Bicycle();
    }
}
