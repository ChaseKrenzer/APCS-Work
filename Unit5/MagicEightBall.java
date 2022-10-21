/* Write a MagicEightBall class that includes the following:

private final String member variables to hold the possible replies
(if you don’t remember what final means, look it up again)

public member function ask() that takes a single string as input, ignores it,
and returns a string randomly from the possible replies

Write a TestMagicEightBall class that instantiates a MagicEightBall object
and asks it some important questions.
*/

public class MagicEightBall
{
    private final String one = "It is certain";
    private final String two = "Signs point to yes";
    private final String three = "My sources say no";
    private final String four = "Outlook not good";
    private final String five = "Cannot predict now";


    public String ask(String questionIn)
    {
        int r = (int)(Math.random() * 5);
          if (r == 0)
            return one;
          if (r == 1)
            return two;
          if (r == 2)
            return three;
          if (r == 3)
            return four;
          if (r == 4)
            return five;
          else
            return ("8 BALL ERROR");

    }
}
