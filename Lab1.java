
package uhh.lab1;
import java.util.*;

/**
 *
 * @author devoncz
 */
public class Lab1 {
    
    /** Creates a new instance of Lab1 */
    public Lab1() {
    }
    
    
    /**
       Print a list of nerds.
       @param A list containing GenericNerd objects.
     */
    public static void showNerdList(ArrayList<GenericNerd> list)
    {
        System.out.println();
        System.out.println("************************************************");
        System.out.println("*             List of Known Nerds              *");
        System.out.println("************************************************");
        System.out.println();
        
        if(list.size() == 0)
        {
            System.out.println("\tThere are no nerds.");
        }
        
        for(int i = 0; i < list.size(); i++)
        {
            GenericNerd nerd = list.get(i);
            // note implicit call to nerd.toString() below.
            System.out.println("\t" + nerd);
        }
        
        System.out.println();
        System.out.println("************************************************");
        System.out.println("*               End of Nerd List               *");
        System.out.println("************************************************");
        System.out.println();
    }
    
    /**
       Harass all of the nerds in the list.
       @param A list containing GenericNerd objects.
     */
    public static void harassNerds(ArrayList<GenericNerd> list)
    {
        System.out.println();
        System.out.println("************************************************");
        System.out.println("*               Harassing Nerds                *");
        System.out.println("************************************************");
        System.out.println();
        
        if(list.size() == 0)
        {
            System.out.println("\tThere are no nerds to harass.");
        }
        
        for(int i = 0; i < list.size(); i++)
        {
            GenericNerd nerd = list.get(i);
            nerd.harass();
        }
        
        System.out.println();
        System.out.println("************************************************");
        System.out.println("*   Finished Harassing Nerds (that was fun!)   *");
        System.out.println("************************************************");
        System.out.println();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println("<<< CS 420 Lab 1 Test Code. >>>");
        
        // List to keep a few nerds in
        ArrayList<GenericNerd> nerdList = new ArrayList(10);
        
        // create a few nerds and add them to the list
        GenericNerd nerd = new GenericNerd("Bugger McNosePicker", 9);
        nerdList.add(nerd);
        // This will generate a warning message:
        nerd = new GenericNerd("Lame-o Lamerson", 12);
        nerdList.add(nerd);
        
        
        // POLYMORPHISM IN ACTION!!!
        nerd = new Trekkie("Captain Spazz", 3,false,true);
        nerdList.add(nerd);
        nerd = new Trekkie("Lt. Commander Loser", 10,true,true);
        nerdList.add(nerd);
        // generate another warning (Klingon speaker of a low level)
        nerd = new Trekkie("Deanna Troi fanboy", 6,true,false);
        nerdList.add(nerd);
        // round out the list with a few more various nerds
        nerd = new GenericNerd("Baron Ron von Dorkenstein", 10);
        nerdList.add(nerd);
        nerd = new GenericNerd("Donnie Doofus", 8);
        nerdList.add(nerd);
        
        // Gamer Geeks
        nerd = new GamerGeek("PC Gamer", 1, 8);
        nerdList.add(nerd);
        nerd = new GamerGeek("PS5 Gamer", 2, 10);
        nerdList.add(nerd);
        nerd = new GamerGeek("Xbox Gamer", 3, 3);
        nerdList.add(nerd);
        
        //Gamer Geek Error Testing (Bad Nerd Factor)
        /*
        nerd = new GamerGeek("Bad PC Gamer", 1, 4);
        nerdList.add(nerd);
        nerd = new GamerGeek("Bad PS5 Gamer", 2, 11);
        nerdList.add(nerd);
        nerd = new GamerGeek("Bad Xbox Gamer", 3, 7);
        nerdList.add(nerd);
        */
        
        //Gamer Geek Error Testing (Invalid Console)
        /*
        nerd = new GamerGeek("Invalid Gamer 0", 0, 4);
        nerdList.add(nerd);
        nerd = new GamerGeek("Invalid Gamer 4", 4, 8);
        nerdList.add(nerd);
        */
        
        //Cosplay Trekkies
        nerd = new CosPlayTrekkie("Joe Mother", 7, false, true, "Vulcan");
        nerdList.add(nerd);
        nerd = new CosPlayTrekkie("Glenn", 4, true, true, "Borg drone");
        nerdList.add(nerd);
        nerd = new CosPlayTrekkie("Jimmy", 10, true, false, "Klingon");
        nerdList.add(nerd);
        
        //Test of polymorphism
        Trekkie t = new CosPlayTrekkie("Randy", 5, false, true, "Federation Officer");
        nerdList.add(t);
        
        // print out a list of the nerds:
        showNerdList(nerdList);
        
        // harass all of the nerds
        harassNerds(nerdList);
        
    }
    
}

