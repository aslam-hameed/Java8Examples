package person.aslam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aslam on 3/14/16.
 */
public class MethodReference {
    public static void main(String[] args) {
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);

        StringBuffer joined = new StringBuffer();
        names.forEach(joined::append);

        System.out.println(joined.toString());
    }
}
