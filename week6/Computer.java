import java.awt.Color

public class Computer
{
    private int year;
    private double price;
    private String company;
    private Color color;

    public Computer ()
    {
        year = 2016;
        price = 550.99;
        company =  dell;
        color = Color.BLACK;
    }
    public computer (int year, double price, String company, Color color)
    {
        this.year = year;
        this.price = price;
        this.company = company;
        this.color = color;
    }
}