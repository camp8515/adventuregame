import java.util.*;
/**
 * Place.java
 * This class represents the various places things can be in
 * @author Deniz Sert
 * @version February 27, 2018
 */
public class Place extends NamedThing{
    private static ArrayList<NPC> characters = new ArrayList<NPC>();
    public Place(){
        for(int i = 0; i< (int)(Math.random()*5) ; i++){
            characters.set(i,new NPC());  
        }  
    }    
    
    /**
     * Returns the number of foes in an area
     * @return the foes in an area
     */
    public int getNumFoe(){
        return characters.size();    
    }
}