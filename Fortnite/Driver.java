import java.util.*;
/**
 * 
 * 
 */
public class Driver{
    public static void main (String[] args){
        System.out.println("\f");
        Scanner scan = new Scanner(System.in);
        String com="";
        
        
        System.out.println("*******************Welcome to Fornite! \n*******************");
        System.out.println("You've been kidnapped and thrown onto an island with only your pickaxe, and you " 
        + "need to survive... good luck");
        if ((int)(Math.random()*4)) == 2){
            System.out.println("An enemy has appeared. \n Run or Fight?");
            com=scan.nextLine();
            if(com.equals("Run"){
                System.out.println("You ran away.");
            }
            
            if(com.equals("Fight"){
                System.out.println("You have the following items in your backpack");
                for (int i=0;i<inventory.size();i++){
                    Arrays.toString(inventory.toArray())
                }
            }
            
        }
        
        
    }
}