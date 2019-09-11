import java.awt.Color;
public class Shoes
{
    private String brand;
    private Color primaryColor;
    private Color secondaryColor;
    private double size;

    public Shoes()
    {
        brand = "Vans";
        primaryColor = Color.BLACK;
        secondaryColor = Color.WHITE;
        size = 8.5;
    }
    public String toString()
    {
        return "this is are my shoes";
    }
}