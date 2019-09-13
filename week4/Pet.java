import java.awt.Color;

public class Pet
{
    private Color color;
    private String species;
    private int age;
    private double weight;
    private String name;

    public Pet()
    {
        Color = color.BLACK;
        species = "dog";
        age = 3;
        weight = 55.7;
        name = "john"

    }
    public void eat (double amountOfFood)
    {
        weight += amountOfFood;
    }
    public pet (Color color, String species, int age, double wight,String name,)
    {
        this.Color = color;
        this species = species;
        this.age =age;
        this.weight = weight;
        this.name = name;
    }
}