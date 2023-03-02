// Write a Shape class, with private variables for name and number of sides,
//constructor, and accessor functions

public class Shape
{
  public Shape(String name, int sides)
    {
        this.name = name;
        this.sides = sides;
    }

    public String getName()
    {
        return name;
    }

    public int getSides()
    {
        return sides;
    }

    public String toString()
    {
      return name;
    }


    private String name;
    private int sides;

}
