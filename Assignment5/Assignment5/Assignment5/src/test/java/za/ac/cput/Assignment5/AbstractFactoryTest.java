package za.ac.cput.Assignment5Patterns;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.Assignment5.CreationalPatterns.AbstractFactoryMethod.VW;
import za.ac.cput.Assignment5.CreationalPatterns.AbstractFactoryMethod.VWFactory;

/**
 * Created by Avcuyile on 2017/03/31.
 */
public class AbstractFactoryTest extends TestCase{
    @Test
    public void testAbstractFactoryMethod() throws Exception {
        VWFactory vwFactory = new VWFactory() {
            @Override
            public VW getCarType(String carType) {
                return null;
            }
        };

    }


}
