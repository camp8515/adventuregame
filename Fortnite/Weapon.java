import java.util.*;
/**
 * Place.java
 * This class represents the various places things can be in
 * @author Deniz Sert, Nic Campanile
 * @version February 27, 2018
 */
public class Place extends NamedThing{
    private String name;
    private Weapon weapon;
    private Note n;

    public Place(String _name){
        name = _name;
        int r = (int)(Math.random()*3);
        if(r==0)
            weapon = new Weapon("bow");
        else if (r==1)
            weapon = new Weapon("sword");
        else if (r==2)
            weapon = new Weapon("dagger");
    }

    public String toString(){
        return name;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public String getName(){
        return name;
    }
}
