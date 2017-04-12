package za.ac.cput.Assignment5.CreationalPatterns.BuilderPattern;

/**
 * Created by Avcuyile 2017/03/31.
 */
public interface DiplomaCourseBuilder {
    public void buildTechnicalPrograming();
    public void buildInformationSystems();
    public void buildInternetPrograming();
    public void buildDevelopmentSoftware();

    public DiplomaCourse getDiplomaCourse();

}
