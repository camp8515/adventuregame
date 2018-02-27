import java.util.*;
/**
 * Character.java
 * This class describes a character.
 * @author Deniz Sert, Nic Campanile
 * @version February 20, 2018
 */
public class Character extends NamedThing{
    private int health;
    private ArrayList<Item> backpack = new ArrayList<Items>();

    public String getItems(){
        return backpack.toString();
    }

    public void setHealth(int h){
        this.health=h;
    }

    public int getHealth(){
        return health;
    }
}
