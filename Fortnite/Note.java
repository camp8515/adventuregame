/**
 * Note.java
 * This class represents a piece of paper that has a clue.
 * @author Deniz Sert, Nic Campanile
 * @version March 3, 2018
 */
public class Note extends Item{
    String clue;
    Place location;
    
    public Note(String s){
        this.clue=s;
    }
    
    public Note(String _clue, Place _location){
        location = _location;
        clue = _clue;
    }
    
    public String getClue(){
        return clue;
    }
    
    public Place getLocation() {
        return location;
    }
    
    public String toString(){
     return clue;        
    }
    
    
}
