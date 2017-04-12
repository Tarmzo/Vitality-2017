package za.ac.cput.Assignment5.CreationalPatterns.FactoryMethod;

/**
 * Created by Avcuyile 2017/03/31.
 */

public class DeveloperFactory {
    private static DeveloperFactory developerFactory = null;
    public DeveloperFactory() {
    }
    public static DeveloperFactory getDeveloperFactoryInstance() {
        if (developerFactory == null)
            return new DeveloperFactory();
        return developerFactory;
    }
    public Developer getDeveloperRole(String developer) {
        if ("Analyst Programmer".equalsIgnoreCase(developer)) {
            return new Analyst();
        } else {
            return new Consultant();
        }
    }
}

