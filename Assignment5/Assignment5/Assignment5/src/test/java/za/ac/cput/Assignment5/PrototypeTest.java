package za.ac.cput.Assignment5;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.Assignment5.CreationalPatterns.AbstractFactoryMethod.Subject;
import za.ac.cput.Assignment5.CreationalPatterns.PrototypePattern.Lecturer;

/**
 * Created by Avcuyile on 2017/03/31.
 */
public class PrototypeTest extends TestCase {
    @Test
    public void testPrototype() throws Exception {
        Lecturer lect = new Lecturer("Avu");
        Lecturer lect2 = (Lecturer) lect.makeCopy();
        Lecturer lect3 = (Lecturer) lect.makeCopy();


        Subject sub2 = new Subject() {
            @Override
            public String getSubjectName() {
                return null;
            }
        };

        Assert.assertEquals(lect2.toString(), lect.toString());
        System.out.println(lect.toString());
    }
}
