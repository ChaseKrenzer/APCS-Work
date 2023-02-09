
import java.util.*;
public class RectangleTest
{
  public static double avgPerimeter(Rectangle[][] array)
  {
    double average = 0;
    double number = 0;
    for (int i=0; i<array.length; i++)
    {
        for (int j=0; j<array[i].length; j++)
        {
          average += array[i][j].getPerimeter();
          number ++;
        }
    }
    return average/number;
  }

  public static double greatestArea(Rectangle[][] array)
  {
    double greatest = 0;
    for (int i=0; i<array.length; i++)
    {
        for (int j=0; j<array[i].length; j++)
        {
          if (array[i][j].getArea() > greatest)
            greatest = array[i][j].getArea();
        }
    }
    return greatest;
  }

  public static void main(String[] args)
      {

        Rectangle[][] array = new Rectangle[3][3];
            array[0][0] = new Rectangle("A", 2.0, 2.0);
            array[0][1] = new Rectangle("B", 3.0, 3.0);
            array[0][2] = new Rectangle("C", 4.0, 4.0);
            array[1][0] = new Rectangle("D", 1.0, 2.0);
            array[1][1] = new Rectangle("E", 1.0, 3.0);
            array[1][2] = new Rectangle("F", 1.0, 4.0);
            array[2][0] = new Rectangle("G", 2.0, 1.0);
            array[2][1] = new Rectangle("H", 1.0, 1.0);
            array[2][2] = new Rectangle("I", 3.0, 1.0);


          System.out.println("Average Perimeter: " +
              avgPerimeter(array));

           System.out.println("Greatest Area: " +
              greatestArea(array));
      }
}
