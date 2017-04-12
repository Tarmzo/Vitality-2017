package za.ac.cput.person;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Avcuyile on 2017/04/02.
 */

public class Names {
    public List people;

    public Names(){
        people = new List();
    }

    public void addNickName(String name2){
        people.add(name2);
    }
    public void removePerson(String name2){
        people.remove(name2);
    }
}