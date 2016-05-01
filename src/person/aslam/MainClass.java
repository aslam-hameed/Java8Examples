package person.aslam;

/**
 * Created by Aslam on 2/28/16.
 */
public class MainClass {

    public static void main(String[] args) {
        new MainClass().process();
    }

    private void process() {
        Boxes<Box> boxes = new Boxes<Box>();
        boxes.addBox(new Box(1, "Box1", "content1"));
        boxes.addBox(new Box(2, "Box2", "content2"));
        System.out.println(boxes);

        Boxes<SizedBox> sizedBoxes = new Boxes<SizedBox>();
        sizedBoxes.addBox(new SizedBox(1, "BigBox1", "content1"));
        sizedBoxes.addBox(new SizedBox(2, "BigBox2", "content2", 2));
        sizedBoxes.addBox(new SizedBox(3, "BigBox3", "content3", 3));
        System.out.println(sizedBoxes);

        for(Box box : sizedBoxes) {
            System.out.println(box);
        }

    }
}
