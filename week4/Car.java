import java.awt.Color;

public class Car
{
    private String model;
    private Color color;
    private double amountOfGas;
    private int numPassengers;
    private final double mpg;

    public void drive (double distance)
    {
        amountOfGas -= distance / mpg;
    }

    public double getAmountOfGas()
    {
        return amountOfGas;
    }

    public Car()
    {
        model= "mustang";
        color = Color.YELLOW;
        tank = 100.7;
        numPassengers = 2;
        mpg = 15.0;
    }
    public String toString()
    {
        "this is my mustang"
    }
}
