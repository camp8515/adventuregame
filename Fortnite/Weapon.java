/**
 * 
 * 
 * 
 */
public class Weapon extends Item{
    private String name;
    private int damage;

    public Weapon(){
        
    }
    
    /**
     * Randomly generates a damage level for weapon
     * @param n name
     */
    public Weapon(String n){
        this.damage=(int)(Math.random()*10+1);
        this.name=n;
    }

    public String toString(){
        return "This is a " + this.name + " with a damage level of " + " damage.";
    }

    public String getWeaponName(){
        return this.name;   
    }

    public void setName(String s){
        this.name=s;
    }
}