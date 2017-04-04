package za.ac.cput.employee;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Avcuyile on 2017/04/02.
 */

public class SalaryTest {
    private Salary salary;

    @Before
    public void setUp() throws Exception {
        salary = new SalaryImpl();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void salaryTest() throws Exception {
       Assert.assertEquals(1249.5, salary.basic(25.50, 49));
    }
}