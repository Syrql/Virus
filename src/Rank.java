import java.util.Comparator;

public class Rank implements Comparator<Virus> {

    /**
     * This method is very helpful to compare values
     * @param o1 first compare type
     * @param o2 second compare type
     * @return first contracted risk
     */
    @Override
    public int compare(Virus o1, Virus o2) {
        return Double.compare(o2.risk(), o1.risk());
    }
}
