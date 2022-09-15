public class Cubes
{
    public static void main(String[] args)
    {

      System.out.println("Cubes");
      System.out.println();
      int n = 0;
      for (int i = 0; i < 15; i++){
        n = i * i;
          for (int x = 0; x < 150; x++){
            if (x == n)
              System.out.println(x);
          }
        }


}
}
