/* Write a ShapeCollection class, which has a private ArrayList of Shape objects.
 Include the following:
    -%%a function to add a shape to the collection
    -a function that takes a shape name as input, looks up the shape object by
    name, and returns the number of sides of the named shape:
          int numberOfSides(String shapeName)
    -%%a function that returns the average number of sides of the shapes in the
    collection
    -%%a function that returns an ArrayList of the shapes with an even number of
    sides */
import java.util.*;
public class ShapeCollection
{
  public ShapeCollection()
      {
          shapes = new ArrayList<Shape>();
      }

  public static void add(String name, int sides)
      {
          Shape shape = new Shape(name, sides);
          shapes.add(shape);
      }

  public static int numberOfSides(String name)
      {
        for (Shape s : shapes)
        {
            if (s.getName() == name)
              return s.getSides();
        }
        return 0;
      }

  public static int avgSides()
      {
          int total = 0;

          for (Shape s : shapes)
              total += s.getSides();

        return total / shapes.size();
      }

  public static ArrayList<Shape> getEvenShapes()
      {
          ArrayList<Shape> result = new ArrayList<Shape>();

          for (Shape s : shapes)
              if (s.getSides()% 2 == 0)
                     result.add(s);

        return result;
       }
  public static void main(String[] args)
      {
          ShapeCollection collection = new ShapeCollection();

          collection.add("Circle", 1);
          collection.add("Rectangle", 4);
          collection.add("Octagon", 8);
          collection.add("Triangle", 3);

          for (Shape s : shapes)
             System.out.println(s.getName() + " has " + numberOfSides(s.getName()) +
             " sides.");

          System.out.println("Shapes with Even Sides:" + collection.getEvenShapes());
          System.out.println("Average Sides: " + collection.avgSides());
          }
private static ArrayList<Shape> shapes;
}
