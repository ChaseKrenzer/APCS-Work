/* Write a Rectangle class that includes the following:

private double member variables for base and height

public constructor with base and height as inputs

public accessor functions for base and height

public member function to return the area of the rectangle

public member function to return the perimeter of the rectangle

public member function to return the length of a diagonal of the rectangle
*/

public class Rectangle
{
    private double base;
    private double height;

    public Rectangle(double baseIn, double heightIn)
    {
        base = baseIn;
        height = heightIn;
    }

    // public accessor function

    public double getBase()
    {
        return base;
    }
    public double getHeight()
    {
        return height;
    }

    public double area()
    {
        return (base * height);
    }

    public double perimeter()
    {
        return ((2 * base) + (2 * height));
    }

    public double diagonal()
    {
        return Math.sqrt((base * base)+(height * height));
    }


}
