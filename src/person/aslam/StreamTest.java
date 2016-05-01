package person.aslam;

import java.io.Console;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Aslam on 3/20/16.
 */
public class StreamTest {

    public static void main(String[] args) {
        Box box1 = new Box(1, "name_1", "content_1");
        Box box2 = new Box(2, "name_2", "content_2");
        Box box3 = new Box(3, "name_3", "content_4");
        Box box4 = new Box(4, "name_3", "content_3");

        List<Box> boxes = Arrays.asList(box2, box1, box4, box3);

        boxes.stream().forEach(System.out::println);

        System.out.println(boxes.stream().allMatch(b1 -> b1.getName().contains("name")));

        boxes.stream().filter(b1 -> b1.getName().equals("name_3")).forEach(System.out::println);

        boxes.stream().map(b1 -> b1.getName()).forEach(System.out::println);

        System.out.println(boxes.stream().
                filter(b1 -> b1.getName().equals("name_3")).
                map(b1 -> b1.getNum()).
                reduce((i1, i2) -> (i1 + i2) / 2));
    }
}
