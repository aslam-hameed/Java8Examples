package person.aslam;

/**
 * Created by Aslam on 2/28/16.
 */
public class SizedBox extends Box {

    private int size;

    public SizedBox(int num, String name, String content) {
        super(num, name, content);
        size = 0;
    }

    public SizedBox(int num, String name, String content, int size) {
        super(num, name, content);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "SizedBox{" +
                "size=" + size +
                '}';
    }
}
