import java.awt.Color

public class Airplane
{
    private String Airline;
    private Color color;
    private double amountOfFuel;
    private int numPassangers;
    private boolean isItFlying;

    public Airplane()
    {
        Airline = "American Airlines";
        color = Color.WHITE;
        amountOfFuel = 1000.5;
        numPassangers = 150;
        isItFlying = true
    }
    private Airplane (String Airline, Color color, double amountOfFuel, int numPassangers, boolean isItFlying)
    {
        this.Airline = Airline;
        this.color =color;
        this.amountOfFuel = amountOfFuel;
        this.numPassangers = numPassangers;
        this.isItFlying = isItFlying;
    }

}