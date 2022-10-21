public class TestRectangle
{
    public static void testRec(Rectangle r, double expectedArea,
                      double expectedDiagonal, double expectedPerimeter)
    {
        double areaResult = r.area();
        double diagonalResult = r.diagonal();
        double perimeterResult = r.perimeter();
        double base = r.getBase();
        double height = r.getHeight();

        System.out.println("Base: " + base + " Height: " + height);

        System.out.print (" Expected Area: " + expectedArea + " result: " + areaResult);
          if (expectedArea == areaResult)
              System.out.println(" TRUE!");
          else
              System.out.println(" FALSE");

        System.out.print(" Expected Diagonal: " + expectedDiagonal + " result: " + diagonalResult);
                if (expectedDiagonal == diagonalResult)
                    System.out.println(" TRUE!");
                else
                    System.out.println(" FALSE");

        System.out.print(" Expected Perimeter: " + expectedPerimeter + " result: " + perimeterResult);
                if (expectedPerimeter == perimeterResult)
                    System.out.println(" TRUE!");
                else
                    System.out.println(" FALSE");
    }


    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(3, 4);

        Rectangle r2 = new Rectangle(10, 10);


        testRec(r1, 12, 5, 14);
        testRec(r2, 100, 14.142135623730951, 40);
    }
}
