/**
 * Note.java
 * This class represents a piece of paper that has a clue.
 * @author Deniz Sert, Nic Campanile
 * @version March 3, 2018
 */
public class Note extends Item{
    String clue;
    
    public Note(String s){
        this.clue=s;
    }
    
    public Note(){
        clue=Place.getWeaponName();
    }
    
    public String getClue(){
        return clue;
    }
    
    public String toString(){
     return clue;        
    }
    
    
}