import java.util.UUID;

public class Covid implements Virus {

    @Override
    public String virusName() {
        return "Covid";
    }

    @Override
    public UUID virusID() {
        return UUID.randomUUID();
    }

    @Override
    public int careTime() {
        return 14;
    }

    @Override
    public double risk() {
        return 4.5D;
    }

    @Override
    public double distance() {
        return 2.0D;
    }

    @Override
    public int appearance() {
        return 2019;
    }

    @Override
    public double deadProbability() {
        return 40;
    }
}
