public class FizzBuzz
{
    public static void main(String[] args)
    {
      System.out.println("Fizz Buzz");
      System.out.println();
      for (int i = 1; i < 30; i++){
        if (i%15 == 0){
          System.out.println("FizzBuzz!");
        }
        else if (i%5 == 0){
          System.out.println("Buzz");
        }

        else if (i%3 ==0){
          System.out.println("Fizz");
        }
        else
          System.out.println(i);
        }
    }
}
