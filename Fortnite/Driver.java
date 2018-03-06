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
        int iteration=0;

        System.out.println("*******************\nWelcome to Fornite! \n*******************");
        System.out.println("You've been kidnapped and thrown onto an island with only your pickaxe, and you " 
            + "need to survive\n... good luck");

        while(life){   
            if(iteration>0)
                System.out.println("The sun's going down, it's time to move on.");
            System.out.println("\n\nPick a location: \n1)Loot Lake\n2)Greasy Grove\n3)Titled Towers\n4)Lonely Lodge");

            icom = scan.nextInt();

            currentPlace = locations.get(icom-1);
            System.out.println("\nYou're at " + currentPlace + ".");
            icom=0;
            if ((int)(Math.random()*4) == 2){
                Foe foe = new Foe();
                System.out.println("An enemy has appeared. Fight!");

                if(p.getBackpack().size()>0){
                    System.out.println("You have the following items in your backpack");
                    for (int i=0;i<p.getBackpack().size();i++){
                        System.out.println(p.getBackpack().get(i).toString());
                    }
                }
                else
                    System.out.println("You don't have any weapons! You have to fight with your " 
                        + "bare hands!");

                b=foe.fight();
                if (b==true){ //player wins fight
                    System.out.println("You won the fight. You've acquired the foe's inventory.");

                    for (int i=0;i<foe.getBackpack().size();i++){ //acquire foe inventory
                        p.getBackpack().add(foe.getBackpack().get(i));

                    }

                }
                if (b==false){ //player loses fight
                    System.out.println("\nYou've lost the game. Goodbye.");
                    life=false;
                    System.exit(0); //ends game
                }

            }

            r=(int)(Math.random()*3); //player finds either a note, treasure, or a weapon
            int r1 = (int)(Math.random()*3); //random notes
            if(r==2){ //player finds treasure
                Item t = new Treasure();
                //t.makeSound();
                System.out.println("You found some treasure!");
                p.addItem(t);
            }

            if (r==1){ //sets game direction. notes help you find cool stuff in game
                //debug if statement
                ArrayList<Place> newLocations = new ArrayList<Place>();
                for(int i=0;i<locations.size();i++){ //makes the currentPlace not an option to go to
                    newLocations.add(i, locations.get(i));
                    if(newLocations.get(i).getName().equalsIgnoreCase(currentPlace.getName()))
                        newLocations.remove(i);
                }
                System.out.println("You found a note!");
                if (r1==0){
                    Item n = new Note(currentPlace.getWeapon().getWeaponName(), currentPlace);
                    System.out.println("The note says: Get a " + n + " from " + newLocations.get(0).getName());
                    p.addItem(n);
                }
                if(r1==1){
                    Note n = new Note(currentPlace.getWeapon().getWeaponName(), currentPlace);
                    System.out.println("The note says: Get a " + n + " from " + newLocations.get(1).getName());
                    p.addItem(n);
                }

                if(r1==2){
                    Note n = new Note(currentPlace.getWeapon().getWeaponName(), currentPlace);
                    System.out.println("The note says: Get a " + n + " from " + newLocations.get(2).getName());
                    p.addItem(n);
                }
            }

            if(r==0){
                System.out.println("You found a " + currentPlace.getWeapon().getWeaponName() + 
                    ". This will increase your chances of winning a fight.");
                p.addItem(currentPlace.getWeapon());

            }
            iteration++;
        }

    }
}

