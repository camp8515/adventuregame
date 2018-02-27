/**
 * Place.java
 * This class represents the various places things can be in
 * @author Deniz Sert
 * @version February 27, 2018
 */
public class Place extends NamedThing{
    private ArrayList<NPC> characters = new ArrayList<NPC>();
    public Place(){
        for(int i = 0; i< (int)(Math.random()*5) ; i++){
            characters.set(i) = new NPC();  
        }  
    }    
}