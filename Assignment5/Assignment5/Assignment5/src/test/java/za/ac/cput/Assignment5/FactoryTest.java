package za.ac.cput.Assignment5;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.Assignment5.CreationalPatterns.FactoryMethod.Developer;
import za.ac.cput.Assignment5.CreationalPatterns.FactoryMethod.DeveloperFactory;

/**
 * Created by Avcuyile on 2017/03/31.
 */
public class FactoryTest extends TestCase {
    @Test
    public void testEmployee() throws Exception {
        DeveloperFactory developerFactory = new DeveloperFactory();

        Developer developer = developerFactory.getDeveloperRole("Analyst");
        Develope developer2 = developerFactory.getDeveloperRole("Consultant");

        Assert.assertEquals(developer.role(), developer2.role());
    }
}
