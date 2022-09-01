/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uhh.lab1;

public class GamerGeek extends GenericNerd {
    
    public int console;
    public String consoleName;
    
    public GamerGeek(String name, int console, int nerdFactor)
    {
        super(name,nerdFactor);
        
        if(console == 1 && nerdFactor < 5 || nerdFactor < 1 || nerdFactor > 10)
        {
            System.out.println("Warning: Nerd factor for PC gamer must be above 5 (using default 5)");
            this.nerdFactor = 5;
        }
        else if(console == 3  && nerdFactor > 6 || nerdFactor < 1 || nerdFactor > 10)
                {
                    System.out.println("Warning: Nerd factor for Xbox gamer must be between 1 and 6 (using default 6)");
                    this.nerdFactor = 6;
                }
        
       switch(console)
       {
           case 1:
               this.consoleName = "PC";
               break;
           case 2:
               this.consoleName = "PS5";
               break;
           case 3:
               this.consoleName = "Xbox Series X";
               break;
       }
        
        //this.name = name;
        this.console = console;
    }
    
      public String toString()
    {
        return new String(name + " is a level " + nerdFactor + " nerd who plays " + consoleName + ".");
    }
    
    /**
       Harass this nerd.  Harassment is based upon the nerd's nerd factor.
       Postcondition: A message indicating how to harass this nerd is printed.
     */
    public void harass()
    {
        System.out.println("You tell nerd " + name + " " + getHarassment());
    }
    
    public String getHarassment()
    {
        String harassment = null;
        switch (console)
        {
            case 1:
                harassment = new String("Too many bugs on the PC!");
                break;
            case 2:
                harassment = new String("No Xbox game pass on your PlayStation!");
                break;
            case 3:
                harassment = new String("You sure must enjoy seeing ads on your console!");
                break;
            default: // this should never happen!
                System.out.println("Error: unrecognized console code!!!");
                System.exit(2);
        }
        return harassment;
    }
    
}
