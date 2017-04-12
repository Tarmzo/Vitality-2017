package za.ac.cput.assignment4;

import junit.framework.Assert;
import junit.framework.TestCase;
import za.ac.cput.assignment4.objectOrientedProgramming.Polymorphism.BasketBall;
import za.ac.cput.assignment4.objectOrientedProgramming.Polymorphism.Soccer;
import za.ac.cput.assignment4.objectOrientedProgramming.Polymorphism.Sports;

/**
 * Created by Avcuyile on 2017/04/02.
 */

public class TestPolymorphism extends TestCase {
    public void testpolymorphic() throws Exception {
        Sports sprt[] = new Sports[2];
        sprt[0] = new Soccer();
        sprt[1] = new BasketBall();

        Assert.assertEquals("The Two Object Says:", sprt[0].play(), sprt[1].play());
    }
}