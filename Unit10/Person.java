/* a) Write a class Person, including: - private member variables for the
person’s name (String) and number of pets (int) - a constructor that sets these
member variables - public accessor functions for the member variables */

public class Person
{
    public Person(String name, int pets)
    {
        this.name = name;
        this.pets = pets;
    }

    public String getName()
    {
        return name;
    }

    public int getPets()
    {
        return pets;
    }

    private String name;
    private int pets;
}
