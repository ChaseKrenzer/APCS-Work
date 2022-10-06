/* Write a function that flips a coin randomly, returning
a String, either “Heads” or “Tails”. Functions involving
randomness are a little tricky to write unit tests for.
So you should just have your main() function print the
results from 10 or 20 coin flips to try out your function. */

public class CoinFlip
{

public static String CoinFlip(){
    int r = (int)(Math.random() * 3);
    String heads = "Heads";
    String tails = "Tails";
      if(r % 2 == 0)
        return heads;
      else
        return tails;
      }

  public static void main(String[] args)
      {
         for(int i = 0; i < 20; i ++){
           System.out.println(CoinFlip());
         }

      }
}
