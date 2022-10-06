/*Write a function that returns the result of rolling a
single 6-sided die. In other words, when you call the
function, it should randomly return 1, 2, 3, 4, 5, or 6.*/

public class DieRolling
  {

  public static int DieRolling(){
      int r = (int)(Math.random() * 7);
      return r;
        }

    public static void main(String[] args)
        {
           for(int i = 0; i < 20; i ++){
             System.out.println(DieRolling());
           }

        }
  }
