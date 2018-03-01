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
        int icom;
        boolean b=false;
        int r;
        ArrayList<Place> locations = new ArrayList<Place>();
        locations.add(0, new Place("Loot Lake"));
        locations.add(1, new Place("Greasy Grove"));
        locations.add(2, new Place("Tilted Towers"));
        locations.add(3, new Place("Lonely Lodge"));
        Place currentPlace;
        boolean life=true;

        System.out.println("*******************\nWelcome to Fornite! \n*******************");
        System.out.println("You've been kidnapped and thrown onto an island with only your pickaxe, and you " 
            + "need to survive... good luck");
        System.out.println("Pick a location: \n1)Loot Lake\n2)Greasy Grove\n3)Titled Towers\n4)Lonely Lodge");
        icom = scan.nextInt();
        currentPlace = locations.get(icom-1);

        System.out.println("\nYou're at " + currentPlace + ".");
        if ((int)(Math.random()*4) == 2){
            NPC foe = new NPC();
            System.out.println("An enemy has appeared. Fight!");
            com=scan.nextLine();

            if(com.equals("Fight")){
                System.out.println("You have the following items in your backpack");
                for (int i=0;i<p.getBackpack().size();i++){
                    Arrays.toString(p.getBackpack().toArray());
                }

                b=foe.fight();
                if (b==true){
                    System.out.println("You won the fight. You've acquired the foe's inventory.");

                    for (int i=0;i<foe.getBackpack().size();i++){ //acquire foe inventory
                        p.getBackpack().add(foe.getBackpack().get(i));

                    }

                }
                if (b==false){
                    System.out.println("\nYou've lost the game. Goodbye.");
                    System.exit(0); //ends game
                }

            }

            
        }

        r=(int)(Math.random()*3);
        if(r==2){
            Item t = new Treasure();
            System.out.println("You found some treasure!");
            t.makeSound();
        }

    }
}