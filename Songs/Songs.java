

public class Songs {
    private String name;
    private String title;
    private int playsnumber;

    //Constructor
    /**
    * @ConstructorParameters artist
    * @ConstructorParameters songname
    * @ConstructorParameters plays
*/
    public Songs(String name, String title, int playsnumber)
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