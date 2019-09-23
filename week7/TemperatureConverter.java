public class TemperatureConverter
{
    private double temperature;
    private boolean isCelsius;

    public TemperatureConverter (double celcius)
    {
        temperature = celsius;
        isCelsius = true;
    }

    public void convertToF()

    if (isCelsius)
    {
        temperature = temperature * 9/5 + 32;
    }
    public String toString()
    {
        String result = "the current temperature is " + temperature + "degrees";
        if(isCelsius)
        {
            result += " celsius";
        }
        else
        {
            result += " Fahrenheit"
        }
        return result;
}