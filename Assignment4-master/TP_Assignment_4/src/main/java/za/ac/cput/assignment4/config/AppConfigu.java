package za.ac.cput.assignment4.config;

import org.springframework.context.annotation.Bean;
import za.ac.cput.assignment4.OOP.Inheritance.Fullback;
import za.ac.cput.assignment4.OOP.encapsulation.EmployeeInformation;

/**
 * Created by Avcuyile on 2017/03/31.
 */

public class AppConfigu {

    @Bean(name = "Encap")
    public EmployeeInformation getEmployeeInfo() {
        return new EmployeeInformation();
    }

    @Bean(name = "inherit")
    public Food getFood() {
        return new eat();
    }

    @Bean(name = "poly")
    public Rugby getPlayer() {
        return new Fullback();
    }


}
