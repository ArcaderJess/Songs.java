import javax.management.ConstructorParameters;

public class Songs {
    private int id;
    private String name;

    //Constructor
    /**
    * @ConstructorParameters artist
    * @ConstructorParameters songname
    * @ConstructorParameters plays

    public Artist(String name, String title, int playsnumber)
{
    this.name = name;
    this.title = title;
    this.playsnumber = playsnumber;
}
//print method
/**
 * 
 */
public void print ()
{
    System.out.println("Artist: " + this.name);
    System.out.println("Song Name: " + this.title);
    System.out.println("Number of Plays: " + this.playsnumber);
    
}
}