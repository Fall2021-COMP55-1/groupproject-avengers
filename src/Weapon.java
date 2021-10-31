import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.awt.*;

public class Weapon { //! Might have to extend Graphics Program
    private static String WEAPON_FOLDER = "media/Weapons/";
    private double firingRate = 0;
    private GImage sprite;

    // TODO Maybe implement an enum that uses weapon, so instead of placing weapon on the character
    // TODO it just uses the getWeapon() and switches main character sprite to sprite with that weapon


    public Weapon(double firingRate, String weapon) {
        this.firingRate = firingRate;
        sprite = new GImage(WEAPON_FOLDER + weapon);
    }

    public GImage getWeaponSprite() {
        return sprite;
    }

    public void setFiringRate(double firingRate) {
        this.firingRate = firingRate;
    }

    public double getFiringRate() {
        return firingRate;
    }
}