import java.util.UUID;

public class Influenza implements Virus {

    @Override
    public String virusName() {
        return "Influenza";
    }

    @Override
    public UUID virusID() {
        return UUID.randomUUID();
    }

    @Override
    public int careTime() {
        return 7;
    }

    @Override
    public double risk() {
        return 0.5D;
    }

    @Override
    public double distance() {
        return 15.0D;
    }

    @Override
    public int appearance() {
        return 1918;
    }

    @Override
    public double deadProbability() {
        return 20;
    }
}
