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
        int icom=0;
        boolean b=false;
        int r=0;
        ArrayList<Place> locations = new ArrayList<Place>();
        locations.add(0, new Place("Loot Lake"));
        locations.add(1, new Place("Greasy Grove"));
        locations.add(2, new Place("Tilted Towers"));
        locations.add(3, new Place("Lonely Lodge"));
        Place currentPlace;
        boolean life=true;

        System.out.println("*******************\nWelcome to Fornite! \n*******************");
        System.out.println("You've been kidnapped and thrown onto an island with only your pickaxe, and you " 
            + "need to survive\n... good luck");
        System.out.println("Pick a location: \n1)Loot Lake\n2)Greasy Grove\n3)Titled Towers\n4)Lonely Lodge");
        while(icom!=1 || icom!=2 || icom!=3 || icom!=4){
            icom = scan.nextInt();
            if (icom!=1 || icom!=2 || icom!=3 || icom!=4)
                System.out.println("Sorry, that is not a valid answer. Try again.");
        }
        currentPlace = locations.get(icom-1);

        System.out.println("\nYou're at " + currentPlace + ".");
        icom=0;
        if ((int)(Math.random()*4) == 2){
            NPC foe = new NPC();
            System.out.println("An enemy has appeared. Fight!");

            System.out.println("You have the following items in your backpack");
            for (int i=0;i<p.getBackpack().size();i++){
                Arrays.toString(p.getBackpack().toArray());
            }

            b=foe.fight();
            if (b==true){ //player wins fight
                System.out.println("You won the fight. You've acquired the foe's inventory.");

                for (int i=0;i<foe.getBackpack().size();i++){ //acquire foe inventory
                    p.getBackpack().add(foe.getBackpack().get(i));

                }

            }
            if (b==false){ //player loses fight
                System.out.println("\nYou've lost the game. Goodbye.");
                System.exit(0); //ends game
            }

        }

        r=(int)(Math.random()*3); //player finds either a note or treasure
        int r1 = (int)(Math.random()*3); //random notes
        if(r==2){ //player finds treasure
            Item t = new Treasure();
            t.makeSound();
            System.out.println("You found some treasure!");
            p.addItem(t);
        }

        if (r==1){ //sets game direction. notes help you find cool stuff in game
            System.out.println("You found a note!");
            if (r1==0){
                Item n = new Note();
                System.out.println("The note says: Get a " + n + " from " + locations.get(0).getName());
                p.addItem(n);
            }
            if(r1==1){
                Note n = new Note();
                System.out.println("The note says: Get a " + n + " from " + locations.get(1).getName());
                p.addItem(n);
            }

            if(r1==2){
                Note n = new Note();
                System.out.println("The note says: Get a " + n + " from " + locations.get(2).getName());
                p.addItem(n);
            }
        }

        System.out.println("You've finished your business here. Where do you want to go?\n");
        System.out.println("Pick a location: \n1)Loot Lake\n2)Greasy Grove\n3)Titled Towers\n4)Lonely Lodge");
        while(icom!=1 || icom!=2 || icom!=3 || icom!=4){
            icom = scan.nextInt();
            if (icom!=1 || icom!=2 || icom!=3 || icom!=4)
                System.out.println("Sorry, that is not a valid answer. Try again.");
        }
        
        currentPlace = locations.get(icom-1);

        System.out.println("\nYou're at " + currentPlace + ".");
        if ((int)(Math.random()*4) == 2){
            NPC foe = new NPC();
            System.out.println("An enemy has appeared. Fight!");

            System.out.println("You have the following items in your backpack");
            for (int i=0;i<p.getBackpack().size();i++){
                Arrays.toString(p.getBackpack().toArray());
            }

            b=foe.fight();
            if (b==true){ //player wins fight
                System.out.println("You won the fight. You've acquired the foe's inventory.");

                for (int i=0;i<foe.getBackpack().size();i++){ //acquire foe inventory
                    p.getBackpack().add(foe.getBackpack().get(i));

                }

            }
            if (b==false){ //player loses fight
                System.out.println("\nYou've lost the game. Goodbye.");
                System.exit(0); //ends game
            }

        }
        
        r=(int)(Math.random()*3); //player finds either a chest or treasure
        
        if(r==2){ //player finds treasure
            Item t = new Treasure();
            t.makeSound();
            System.out.println("You found some treasure!");
            p.addItem(t);
        }

        if (r==1){ 
            System.out.println("You found a chest!");
            p.addItem(currentPlace.getWeapon());
        }
    }
}

