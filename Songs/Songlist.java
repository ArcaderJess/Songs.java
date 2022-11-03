import java.util.ArrayList;

public class Songlist {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
      int num;
      String name;
      String title;
      Songs twrp = new Songs(name: "TWRP", title: "Life Party", playsnumber: 2472740);
      //twrp.print();
      
      Songs franksinatra = new Songs(name: "Frank Sinatra", title: "Fly me to the Moon", playsnumber: 484812195);
      //franksinatra.print()

      Songs talkingheads = new Songs(name: "Talking Heads", title: "This Must be the Place", playsnumber: 202693802);
      //talkingheads.print()

      Songs ladygaga = new Songs(name: "Lady Gaga", title: "Judas", playsnumber: 224037234);
      //ladygaga.print()

      Songs grimes = new Songs(name: "Grimes", title: "Kill V. Maim", playsnumber: 83442560);
      //grimes.print()

      Songs thecure = new Songs(name: "The Cure", title: "Inbetween Days", playsnumber: 105663397);
      //thecure.print()

      Songs billyjoel = new Songs(name: "Billy Joel", title: "We Didn't Start the Fire", playsnumber: 350593931);
      //billyjoel.print()

      Songs theclash = new Songs(name: "The Clash", title: "Rock the Casbah", playsnumber: 254724248);
      //theclash.print()

      Songs madonna = new Songs(name: "Madonna", title: "Material Girl", playsnumber: 294746541);
      //madonna.print()

      Songs thejam = new Songs(name: "The Jam", title: "Town Called Malice", playsnumber: 151484590);
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
       
    }

}
