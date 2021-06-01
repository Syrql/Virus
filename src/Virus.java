import java.util.UUID;

public interface Virus {

    /**
     * This method return the name of the virus
     */

    String virusName();

    /**
     * This method return the id of the virus
     */

    UUID virusID();

    /**
     * This method return the time of care
     */

    int careTime();

    /**
     * This method return the risk of contamination
     */

    double risk();

    /**
     * This method return the minimum contamination distance
     */

    double distance();

    /**
     * This method return the year of appearance
     */

    int appearance();

    /**
     * This method return the probability of dead
     */

    double deadProbability();
}
