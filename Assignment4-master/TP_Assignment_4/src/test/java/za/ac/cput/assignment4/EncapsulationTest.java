package za.ac.cput.assignment4;

import junit.framework.Assert;
import junit.framework.TestCase;
import za.ac.cput.assignment4.objectOrientedProgramming.Encapsulation.Employee;

/**
 * Created by Avcuyile on 2017/04/02.
 */

public class EncapsulationTest extends TestCase {
    public void test() throws Exception {
        Employee employee = new Employee();
        employee.setName("Avuyile");
        employee.setEmpNo("emp_no021");
        employee.setYear(3);

        Assert.assertEquals("Avuyile", employee.getName());
        Assert.assertEquals("emp_no021", employee.getEmpNo());
        Assert.assertEquals(3, employee.getYear());
    }
}
