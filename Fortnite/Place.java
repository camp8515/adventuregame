import java.util.*;
/**
 * Place.java
 * This class represents the various places things can be in
 * @author Deniz Sert, Nic Campanile
 * @version February 27, 2018
 */
public class Place extends NamedThing{
    private String name;
    private static Weapon weapon;
    private Note n = new Note();

    public Place(String _name){
        name = _name;
        int r = (int)(Math.random()*3);
        if(r==0)
            weapon.setName("bow");
        else if (r==1)
            weapon.setName("sword");
        else if (r==2)
            weapon.setName("dagger");
    }

    public String toString(){
        return name;
    }

    public Weapon getWeapon(){
        return weapon;
    }
    
    public static String getWeaponName(){
        return weapon.getWeaponName();   
    }
    
    public String getName(){
        return name;
    }
}
