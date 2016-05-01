package person.aslam;

/**
 * Created by Aslam on 2/28/16.
 */
public class Box {
    private int num;
    private String name;
    private String content;

    public Box(int num, String name, String content) {
        this.num = num;
        this.name = name;
        this.content = content;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Box{" +
                "num='" + num + '\'' +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
