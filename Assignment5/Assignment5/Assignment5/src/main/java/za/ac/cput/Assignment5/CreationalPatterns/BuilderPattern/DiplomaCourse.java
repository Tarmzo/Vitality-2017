package za.ac.cput.Assignment5.CreationalPatterns.BuilderPattern;

/**
 * Created by Avcuyile 2017/03/31.
 */
public class DiplomaCourse {
    private String tP;
    private String iS;
    private String iP;
    private String dS;

    public String gettP() {
        return tP;
    }

    public DiplomaCourse settP(String tP) {
        this.tP = tP;
        return this;
    }

    public String getiS() {
        return iS;
    }

    public DiplomaCourse setiS(String iS) {
        this.iS = iS;
        return this;
    }

    public String getiP() {
        return iP;
    }

    public DiplomaCourse setiP(String iP) {
        this.iP = iP;
        return this;
    }

    public String getdS() {
        return dS;
    }

    public DiplomaCourse setdS(String dS) {
        this.dS = dS;
        return this;
    }

    @Override
    public String toString() {
        return "DiplomaCourse{" +
                "buildTechnicalPrograming='" + tP + '\'' +
                ", buildInformationSystems='" + iS + '\'' +
                ", buildInternetPrograming='" + iP + '\'' +
                ", buildDevelopmentSoftware='" + dS + '\'' +
                '}';
    }

}
