package za.ac.cput.Assignment5.CreationalPatterns.AbstractFactoryMethod;

import za.ac.cput.Assignment5.CreationalPatterns.BuilderPattern.DiplomaCourse;
import za.ac.cput.Assignment5.CreationalPatterns.BuilderPattern.DiplomaCourseBuilder;

/**
 * Created by Avcuyile 2017/03/31.
 */
public class DiplomaCourseDirector {
    private DiplomaCourseBuilder diplomaCourseBuilder= null;
    public DiplomaCourseDirector(DiplomaCourseBuilder diplomaCourseBuilder) {
        this.diplomaCourseBuilder = diplomaCourseBuilder;
    }

    public void constructDiplomaCourse(){
        diplomaCourseBuilder.buildDevelopmentSoftware();
        diplomaCourseBuilder.buildInformationSystems();
        diplomaCourseBuilder.buildTechnicalPrograming();
        diplomaCourseBuilder.buildInternetPrograming();
    }
    public DiplomaCourse getDiplomaCourse() {
        return diplomaCourseBuilder.getDiplomaCourse();
    }

}
