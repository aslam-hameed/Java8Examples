package person.aslam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Aslam on 2/28/16.
 */
public class Boxes<E extends Box> implements Iterable<Box>{
    private List<E> boxes;

    public Boxes() {
        this.boxes = new ArrayList<E>();
    }

    public void addBox(E box) {
        boxes.add(box);
    }


    @Override
    public String toString() {
        return "Boxes{" +
                "boxes=" + boxes +
                '}';
    }

    @Override
    public Iterator<Box> iterator() {
        return (Iterator<Box>)boxes.iterator();
    }
}
