package person.aslam;

import java.util.function.Function;

/**
 * Created by Aslam on 3/20/16.
 */
@FunctionalInterface
public interface Comparator<T> {

    int compare(T b1, T b2);

    static <U> Comparator<U> comparing(Function<U, Comparable> f) {
        return (b1, b2) -> f.apply(b2).compareTo(f.apply(b1));
    }

    default Comparator<T> thenComparing(Function<T, Comparable> f) {
        return thenComparing(thenComparing(f));
    }

    default Comparator<T> thenComparing(Comparator<T> comparator) {
        return (b1, b2) -> compare(b1, b2) == 0 ? comparator.compare(b1, b2) : compare(b1, b2);
    }
}
