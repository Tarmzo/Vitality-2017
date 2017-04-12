package za.ac.cput.Assignment5.CreationalPatterns.PrototypePattern;

/**
 * Created by Avcuyile 2017/03/31.
 */

public class Lecturer implements CloneObject {
    private String name;
    public Lecturer(String name) {
        this.name = name;
    }
    @Override
    public CloneObject makeCopy() {
        return new Lecturer(name);
    }
    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                '}';
    }

}
