package za.ac.cput.assignment4.LSP.Disobey;

/**
 * Created by Avcuyile on 2017/03/31.
 */

public class GoalKeeper implements V_FootballPlayer {
    @Override
    public Boolean Freekick() {
        return null;
    }

    @Override
    public Boolean Saves() {
        return true;
    }

    @Override
    public Boolean GoalKicks() {
        return false;
    }
}
