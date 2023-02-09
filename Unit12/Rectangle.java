/* a) Write a class Rectangle. Include the following:

-private member variables for the name (String), width and height (doubles)

-a constructor that sets these member variables

-public accessor functions for the member variables

-public functions to calculate the perimeter and area

b) Write a function that takes a 2D array of Rectangle objects as input and
returns the average perimeter.

c) Write a function that takes a 2D array of Rectangle objects as input and
returns the object with the greatest area.

*/

public class Rectangle
{
  public Rectangle(String name, double width, double height)
  {
      this.name = name;
      this.width = width;
      this.height = height;
  }

  public String getName()
  {
      return name;
  }

  public double getHeight()
  {
      return height;
  }

  public double getWidth()
  {
      return width;
  }

  public double getPerimeter()
  {
    return 2 * width + 2 * height;
  }

  public double getArea()
  {
    return width * height;
  }

  private String name;
  private double height;
  private double width;

}
