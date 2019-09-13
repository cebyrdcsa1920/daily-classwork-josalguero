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
    /**
     * fills up the tank gas
     *
     * @param amount gas to add tank
     */
    public void fillTank (double amount)
    {
        amountOfGas += amount;
    }
    public Car()
    {
        model= "mustang";
        color = Color.YELLOW;
        amountOfGas = 100.7;
        numPassengers = 2;
        mpg = 15.0;
    }
    public car (String model, Color color, double amountOfGas, int numPassangers, double mpg)
    {
    this.model = model;
    this.color = color
    this.amountOfGas = amountOfGas;
    this.numPassangers = numPassangers;
    this.mpg = mpg;
    }
    public String toString()
    {
        return "this is my mustang";
    }
}
