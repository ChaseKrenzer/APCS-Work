
import processing.core.*;
import java.util.*;


public class Draw extends PApplet
{
  private ArrayList<Ball> balls;

  public void settings()
      {
          size(800, 800);
      }

  public void setup()
  {
     balls = new ArrayList<Ball>();
     createBall();
   }


    public void createBall()
    {
        int positionx = (int)random(1, 599);
        int positiony = (int)random(1, 599);

        int velocityx = (int)random(1, 8);
        int velocityy = (int)random(1, 10);


        float radius = random(5, 20);
        int c = color(random(256), random(256), random(256));

        Ball ball = new Ball(this,
                             positionx,
                             positiony,
                             velocityx,
                             velocityy,
                             radius,
                             c);

         balls.add(ball);
    }

    public void draw()
    {

        for (Ball ball : balls)
            ball.display();
    }

    public void keyPressed()
    {
        for (int i=0; i<50; i++)
            createBall();
    }


    public static void main(String[] args)
    {
        PApplet.main("Draw");
    }

}
