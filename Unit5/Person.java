public class Person
{
   private String name;
   private int pets;
   
    public Person(String newName, int newPets)
    {
        name = newName;
        pets = newPets;
    }

    public void hello()
    {
      System.out.println("Hello, my name is " + name + " and I have " + pets + " pets.");
    }
}
