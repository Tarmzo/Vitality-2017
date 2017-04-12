package za.ac.cput.assignment4.LSP.Obey;

/**
 * Created by Avcuyile on 2017/03/31.
 */

public class Defender implements FootballPlayer {

    @Override
    public Boolean Freekick() {
        return true;
    }

    @Override
    public Boolean Saves() {
        return true;
    }

    @Override
    public Boolean GoalKicks() {
        return true;
    }
}