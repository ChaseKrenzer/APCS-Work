public class TestMagicEightBall
{
    public static void main(String[] args)
    {

        MagicEightBall a = new MagicEightBall();
        System.out.println("Will I get good grades this year?");
        System.out.println(a.ask("Will I get good grades this year?"));

        MagicEightBall b = new MagicEightBall();
        System.out.println("Is this a reliable source?");
        System.out.println(b.ask("Is this a reliable source?"));

        MagicEightBall c = new MagicEightBall();
        System.out.println("Will I win the lottery?");
        System.out.println(c.ask("Will I win the lottery?"));
    }
}
