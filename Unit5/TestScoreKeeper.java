public class TestScoreKeeper
{
    public static void main(String[] args)
    {
        ScoreKeeper score1 = new ScoreKeeper();

        score1.scoreNormal();
        score1.scoreNormal();
        score1.scoreNormal();
        score1.scoreBonus();

        System.out.println("Score 1: " + score1.total());

        ScoreKeeper score2 = new ScoreKeeper();
        score2.scoreNormal();
        score2.scoreBonus();
        score2.scoreBonus();

        System.out.println("Score 2: " + score2.total());
    }
}
