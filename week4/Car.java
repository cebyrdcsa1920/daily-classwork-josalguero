import java.awt.Color;

public class Car
{
    private String model;
    private Color color;
    private double amountOfGas;
    private int numPassengers;
    private final double mpg;

    /**
     * Drives the car the given distance. Substracts gas from the tank.
     *
     * @param distance The distance driven in miles
     */

    public void drive (double distance)
    {
        amountOfGas -= distance / mpg;
    }

    /**
     * gets the amount of gas in the tank
     *
     * @return amounts of gas
     */

    public double getAmountOfGas()
    {
        return amountOfGas;
    }

    public Car()
    {
        model= "mustang";
        color = Color.YELLOW;
        amountOfGas = 100.7;
        numPassengers = 2;
        mpg = 15.0;
    }
    public String toString()
    {
        "this is my mustang"
    }
}
