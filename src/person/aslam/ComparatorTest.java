package person.aslam;

import java.util.*;
import java.util.Comparator;
import java.util.function.Function;

/**
 * Created by Aslam on 3/20/16.
 */
public class ComparatorTest {

    public static void main(String[] args) {

        Box box1 = new Box(1, "name_1", "content_1");
        Box box2 = new Box(2, "name_2", "content_2");
        Box box3 = new Box(3, "name_3", "content_4");
        Box box4 = new Box(4, "name_3", "content_3");

        List<Box> boxes = Arrays.asList(box2, box1, box4, box3);

        boxes.forEach(System.out::println);

/*
        Comparator<Box> compName = (b1, b2) -> b1.getName().compareTo(b2.getName());
        Comparator<Box> compNum = (b1, b2) -> b2.getNum() - b1.getNum();

        Function<Box, String> f1 = p1 -> p1.getName();
        Function<Box, Integer> f2 = p2 -> p2.getNum();

        Comparator<Box> comparatorName = Comparator.comparing(Box::getName);
        Comparator<Box> comparatorAge = Comparator.comparing(Box::getNum);

        Comparator<Box> cName = Comparator.comparing(Box::getName).thenComparing(Box::getNum);
*/
        java.util.Comparator<Box> comparator = Comparator.comparing(Box::getName).thenComparing(Box::getNum);
        boxes.sort(comparator);
        boxes.forEach(System.out::println);
    }
}
