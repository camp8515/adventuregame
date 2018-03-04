import java.util.*;
/**
 * Character.java
 * This class describes a character.
 * @author Deniz Sert, Nic Campanile
 * @version February 20, 2018
 */
public class Entity extends NamedThing{
    private int health;
    private ArrayList<Item> backpack = new ArrayList<Item>();

    public ArrayList getBackpack(){
        return backpack;
    }
    
    public String getItems(){
        return backpack.toString();
    }

    public void setHealth(int h){
        this.health=h;
    }

    public int getHealth(){
        return health;
    }
    
    
    public void addItem(Item i){ //adds item to backpack
        this.backpack.add(i);
        System.out.println("You've added this item to your backpack.");
    }
}