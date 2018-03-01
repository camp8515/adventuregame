import java.util.*;
/**
 * 
 * 
 */
public class Driver{
    private static Player p = new Player();
    
    public static void main (String[] args){
        System.out.println("\f");
        Scanner scan = new Scanner(System.in);
        String com="";
        boolean b=false;
        
        
        System.out.println("*******************Welcome to Fornite! \n*******************");
        System.out.println("You've been kidnapped and thrown onto an island with only your pickaxe, and you " 
        + "need to survive... good luck");
        if ((int)(Math.random()*4) == 2){
            NPC foe = new NPC((int)(Math.random()*4) == 2);
            System.out.println("An enemy has appeared. \n Run or Fight?");
            com=scan.nextLine();
            if(com.equals("Run")){
                System.out.println("You ran away.");
            }
            
            if(com.equals("Fight")){
                System.out.println("You have the following items in your backpack");
                for (int i=0;i<backpack.size();i++){
                    Arrays.toString(backpack.toArray());
                }
                
                b=foe.fight();
                if (b==true){
                    System.out.println("You won the fight. You've acquired the foe's inventory.");
                    for (int i=0;i<foe.backpack.size();i++){
                        
                    }
                    
                }
                
                
                
                
            }
            
            
            
        }
        
        
        
        
    }
    
    
  
}