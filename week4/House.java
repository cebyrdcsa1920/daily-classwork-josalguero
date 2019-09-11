import java.awt.Color;
public class House
{
    private String style;
    private Color color;
    private int numRooms;
    private double size;

    public House()
    {
        style = "Victorian";
        color = Color.WHITE;
        numRooms = 7;
        size =50.7;
    }
    public String toString()
    {
        return "this is my house";
   }
}