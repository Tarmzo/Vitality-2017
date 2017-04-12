package za.ac.cput.Assignment5.CreationalPatterns.PrototypePattern;

/**
 * Created by Avcuyile 2017/03/31.
 */

public class Subject implements CloneObject {
    private String subjectCode;
    public Subject(String subjectCode) {
        this.subjectCode = subjectCode;
    }
    @Override
    public CloneObject makeCopy() {
        return new Subject(subjectCode);
    }
    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode='" + subjectCode + '\'' +
                '}';
    }

}
