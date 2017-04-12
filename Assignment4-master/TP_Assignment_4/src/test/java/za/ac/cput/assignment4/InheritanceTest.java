package za.ac.cput.assignment4;

import junit.framework.Assert;
import junit.framework.TestCase;
import za.ac.cput.assignment4.objectOrientedProgramming.Inheritence.Pasta;
import za.ac.cput.assignment4.objectOrientedProgramming.Inheritence.Rice;

/**
 * Created by Avcuyile on 2017/04/02.
 */

public class InheritanceTest extends TestCase {
    public void testInheritence() throws Exception {
        Pasta pastaObj = new Pasta();
        Rice riceObj = new Rice();

        Assert.assertEquals("The Inherited Objects Are Equal To The Parent Object", riceObj.eat(), pastaObj.eat());
    }

}
