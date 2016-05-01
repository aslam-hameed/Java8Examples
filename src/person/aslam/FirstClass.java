package person.aslam;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by Aslam on 1/27/16.
 */
public class FirstClass implements FirstInterface, SecondInterface{
    public static void main(String[] args) {
        new FirstClass().process();
    }

    private void process() {
        List numbers = Arrays.asList("1", "2", "3");
        for(Object num : numbers) {
            System.out.println(num);
        }
        Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));
        numbers.sort((e1, e2) -> {
            System.out.println(e1 + "-" + e2);
            return -1;
        });
        System.out.println(numbers);
        Car car = Car.create(Car::new);

    }

    @Override
    public void doNothing() {
        System.out.println(FirstInterface.notAVar);

    }
    public static class Car {
        public static Car create( final Supplier< Car > supplier ) {
            return supplier.get();
        }

        public static void collide( final Car car ) {
            System.out.println( "Collided " + car.toString() );
        }

        public void follow( final Car another ) {
            System.out.println( "Following the " + another.toString() );
        }

        public void repair() {
            System.out.println( "Repaired " + this.toString() );
        }
    }

}

