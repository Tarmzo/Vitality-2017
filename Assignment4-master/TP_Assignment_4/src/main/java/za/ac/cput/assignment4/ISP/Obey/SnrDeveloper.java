package za.ac.cput.assignment4.ISP.Obey;

/**
 * Created by Avcuyile on 2017/03/31.
 */

public class SnrDeveloper implements LeadershipQualities, Participation, BestResults {

    @Override
    public Boolean bestDeveloper() {
        System.out.println("Is ia best developer!");
        return true;
    }

    @Override
    public Boolean participation() {
        System.out.println("Always participates!");
        return true;
    }

    @Override
    public Boolean topAcheiver() {
        System.out.println("Always brings awards");
        return true;
    }
}