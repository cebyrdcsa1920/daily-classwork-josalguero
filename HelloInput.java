public class HelloInput
{
    public static void main (String[] args)
    {
        if (args.length != 2)
        {
            System.out.println("usage java HelloInput firstname lastname");
        }
        else
        {
            String firstName = args [0];
            String lastName = args [1];
            System.out.println ("hello " + firstName + " " + lastName);
        }
    }
}