import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Virus program,
 * List all earth virus and compare,
 * Fork allowed.
 *
 * @author SYRQL
 * @since 2021-06-01
 * @link https://github.com/SYRQL
 *
 */

public class Main {

    /**
     * @param virus This list is a virus List
     */

    private static final List<Virus> virus = new ArrayList<>();

    public static void main(String[] args) {
        infect();
        compare();
    }

    /**
     * This method to add all virus in same list
     */

    public static void infect() {
        virus.add(new Influenza());
        virus.add(new Covid());
        virus.add(new Ebola());
    }

    /**
     * This method compare all virus risk
     */

    public static void compare() {
        List<Virus> v = virus.stream().limit(virus.size()).sorted(new Rank()).collect(Collectors.toList());
        AtomicInteger atomicInteger = new AtomicInteger(1);

        v.forEach(virus -> System.out.println(atomicInteger.getAndIncrement() + ". " + virus.virusName()));
    }

    /**
     * @param v Virus to remove from list
     */

    public static void removeVirus(Virus v) {
        virus.remove(v);
    }

    public static List<Virus> getVirus() {
        return virus;
    }
}
