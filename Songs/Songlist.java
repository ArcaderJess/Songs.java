import java.util.ArrayList;

import helpers.InputReader;
public class Songlist {
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
      
       for(Songs artists : artist)
       {
        artist.print();
       } 

       String song = InputReader.getString("Enter song name > ");
       String artists = InputReader.getString("Enter artist name > ");
       int plays = InputReader.getInt("Enter your number of plays > ");
       System.out.println("Song name " + song);
       System.out.println("Artist name " + artist);
       System.out.println("Number of plays " + plays);

    }

}
