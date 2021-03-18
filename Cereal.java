import java.util.ArrayList;
public class Cereal
{
    private double rating;
    private String name;

    public static void main(String[] args)
    {
        Cereal c1 = new Cereal(68.40, "100% Bran");
        System.out.println(c1);
        System.out.println("Name: " + c1.getName());
        System.out.println("Rating: " + c1.getRating());
    }
    public Cereal(double r, String n)
    {
        rating = r;
        name = n;
    }
    public String toString()
    {
        return(name + " has a rating of " + rating);
    }

    public String getName()
    {
        return (name);
    }
    public double getRating()
    {
        return(rating);
    }
}