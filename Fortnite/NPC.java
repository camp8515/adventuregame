/**
 * NPC.java
 * This class represents a non player character
 * @author Deniz Sert, Nic Campanile
 * @verison February 27, 2018
 */
public class NPC extends Entity{
    private int AggressiveLevel;
    
    public NPC(int aggression){
        if (aggression > 10)
            this.AggressiveLevel = 10;
        else if (aggression < 0)
            this.AggressiveLevel = 0;
        else
            this.AggressiveLevel = aggression;
    }
    
    public boolean fight() {
       double results = this.AggressiveLevel * Math.random();
       
       if (results > 5)
        return true;
       else
        return false;
       
    }
        
        
}
