/* Write a ScoreKeeper class that includes the following:

private member variable to keep track of the score (initialized to 0)

public accessor function for the score

public method scoreNormal() that adds 100 to the score

public method scoreBonus() that adds 1000 to the score

Write a TestScoreKeeper class that instantiates a ScoreKeeper object and tests its functions.
*/
public class ScoreKeeper
{
    private int score;

    public ScoreKeeper()
    {
        score = 0;
    }

    public void scoreNormal()
    {
        score += 100;
    }

    public void scoreBonus()
    {
        score += 1000;
    }

    public int total()
    {
        return score;
    }

}
