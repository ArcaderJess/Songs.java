import java.util.ArrayList;

public class Songlist {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
      Artist twrp = new Artist(name: "TWRP", title: "Life Party", playsnumber: 2472740);
      //twrp.print();
      
      Artist franksinatra = new Artist(name: "Frank Sinatra", title: "Fly me to the Moon", playsnumber: 484812195);
      //franksinatra.print()

      Artist talkingheads = new Artist(name: "Talking Heads", title: "This Must be the Place", playsnumber: 202693802);
      //talkingheads.print()

      Artist ladygaga = new Artist(name: "Lady Gaga", title: "Judas", playsnumber: 224037234);
      //ladygaga.print()

      Artist grimes = new Artist(name: "Grimes", title: "Kill V. Maim", playsnumber: 83442560);
      //grimes.print()

      Artist thecure = new Artist(name: "The Cure", title: "Inbetween Days", playsnumber: 105663397);
      //thecure.print()

      Artist billyjoel = new Artist(name: "Billy Joel", title: "We Didn't Start the Fire", playsnumber: 350593931);
      //billyjoel.print()

      Artist theclash = new Artist(name: "The Clash", title: "Rock the Casbah", playsnumber: 254724248);
      //theclash.print()

      Artist madonna = new Artist(name: "Madonna", title: "Material Girl", playsnumber: 294746541);
      //madonna.print()

      Artist thejam = new Artist(name: "The Jam", title: "Town Called Malice", playsnumber: 151484590);
      //thejam.print()

      final Artist ladygaga = new Artist(name: "Lady Gaga", title:: "Americano", playsnumber: 35823174);
      //ladygaga.print()

      ArrayList<Songs> artist = new ArrayList<Songs>();
       artists.add(twrp);
       artists.add(franksinatra);
       artists.add(talkingheads);
       artist.add(ladygaga);
       artist.add(grimes);
       artist.add(thecure);
       artist.add(billyjoel);
       artist.add(theclash);
       artist.add(madonna);
       artist.add(thejam);
       artist.add(ladygaga);

       for(Songs artists : artist)
       {
        artist.print();
       } 
       
    }

}
