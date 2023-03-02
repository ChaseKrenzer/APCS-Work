/* a. Write a Student class, with private variables for name and favorite
number (integer), including constructor and accessor functions. */

public class Student
{
  public Student(String name, int fav)
    {
        this.name = name;
        this.fav = fav;
    }

    public String getName()
    {
        return name;
    }

    public int getFav()
    {
        return fav;
    }

    public String toString()
    {
      return name;
    }


    private String name;
    private int fav;
}
