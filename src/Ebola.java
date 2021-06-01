import java.util.UUID;

public class Ebola implements Virus {

    @Override
    public String virusName() {
        return "Ebola";
    }

    @Override
    public UUID virusID() {
        return UUID.randomUUID();
    }

    @Override
    public int careTime() {
        return 40;
    }

    @Override
    public double risk() {
        return 45D;
    }

    @Override
    public double distance() {
        return 0.5D;
    }

    @Override
    public int appearance() {
        return 1976;
    }

    @Override
    public double deadProbability() {
        return 75;
    }
}
