package models;

import interfaces.Locatable;

/**
 * Created by mahdihs76 on 4/9/18.
 */
public class Building implements Locatable {
    @Override
    public int getPositionX() {
        return 100;
    }

    @Override
    public int getPositionY() {
        return 200;
    }
}
