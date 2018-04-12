package models;

import interfaces.Alive;
import interfaces.Attackable;
import interfaces.Locatable;

/**
 * Created by mahdihs76 on 4/9/18.
 */
public class Soldier implements Alive, Attackable, Locatable {

    @Override
    public void eat() {
        System.out.println("My Soldier eat");
    }

    @Override
    public void drink() {
        System.out.println("My Soldier drink");
    }

    @Override
    public void breathe() {
        System.out.println("My Soldier breathe");
    }

    @Override
    public void attack() {
        // TODO: 4/9/18 felani to ino bzan
    }

    @Override
    public int getPositionX() {
        return 0;
    }

    @Override
    public int getPositionY() {
        return 0;
    }
}
