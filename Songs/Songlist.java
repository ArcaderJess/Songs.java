import java.util.ArrayList;


public class Songlist
 {
  System.out.println("Jess' Song list");
  System.out.println();

}

public static void showMenu()

{
  System.out.println("=========");
  System.out.println("Menu");
  System.out.println("=========");
  System.out.println("1) View Song List");
  System.out.println("2) View Songs in Order of Plays");
  System.out.println("3) Add Song");
  System.out.println("4) Remove Song");
  System.out.println("=========");

  int choice = InputReader.getInt("Menu Number- ");
  if(choice == 1);
  {
    print();
  }
  if(choice ==2);
  {
    getCount();
  }
  if(choice ==3);
  {
    getName();
  }
  if(choice ==4);
  {
    
  }
}


    /**
     * @param args
     */
     public static final String CONSOLE_CLEAR = "\033[H\033[2J";
     public static void main(String[] args)
    {
      int num;
      String name;
      String title;
      Songs twrp = new Songs("TWRP", "Life Party", 2472740);
      //twrp.print();
      
      Songs franksinatra = new Songs("Frank Sinatra", "Fly me to the Moon", 484812195);
      //franksinatra.print()

      Songs talkingheads = new Songs("Talking Heads", "This Must be the Place", 202693802);
      //talkingheads.print()

      Songs ladygaga = new Songs("Lady Gaga","Judas", 224037234);
      //ladygaga.print()

      Songs grimes = new Songs("Grimes", "Kill V. Maim", 83442560);
      //grimes.print()

      Songs thecure = new Songs("The Cure", "Inbetween Days", 105663397);
      //thecure.print()

      Songs billyjoel = new Songs("Billy Joel", "We Didn't Start the Fire", 350593931);
      //billyjoel.print()

      Songs theclash = new Songs("The Clash", "Rock the Casbah", 254724248);
      //theclash.print()

      Songs madonna = new Songs("Madonna", "Material Girl",294746541);
      //madonna.print()

      Songs thejam = new Songs("The Jam", "Town Called Malice", 151484590);
      //thejam.print()


      ArrayList<Songs> artist = new ArrayList<Songs>();
       artist.add(twrp);
       artist.add(franksinatra);
       artist.add(talkingheads);
       artist.add(ladygaga);
       artist.add(grimes);
       artist.add(thecure);
       artist.add(billyjoel);
       artist.add(theclash);
       artist.add(madonna);
       artist.add(thejam);
    }
      
    public static void print()

       {
        for (Song current : songlist)
        {
          current.print();
        }
       } 
public static void getName()

       {

      }

      }

}
