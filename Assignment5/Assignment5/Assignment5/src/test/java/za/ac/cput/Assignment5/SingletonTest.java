package za.ac.cput.Assignment5Patterns;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.Assignment5.CreationalPatterns.SamsungS7;

/**
 * Created by Avcuyile on 2017/03/31.
 */
public class SingletonTest extends TestCase {
   @Test
    public void testCalculator() throws Exception {
       SamsungS7 S6 =  SamsungS7.getInstance();
       SamsungS7 S7 =  SamsungS7.getInstance();

       S6.add(2, 3);
       S7.add(2, 4);

       Assert.assertEquals(S7.hashCode(), S6.hashCode());
    }
}