/* Write a program that animates something on screen. Your program
must use an external class, with a private PApplet member variable
that is set via the constructor, and a display() function to draw
the object. */



import processing.core.*;


public class Ball
{

      private PApplet p;
      private int positionx;
      private int positiony;
      private int velocityx;
      private int velocityy;
      private float radius;
      private int color;

    public Ball(PApplet p, int positionx, int positiony, int velocityx,
                  int velocityy, float radius, int color)
    {
        this.p = p;
        this.positionx = positionx;
        this.positiony = positiony;
        this.velocityx = velocityx;
        this.velocityy = velocityy;
        this.radius = radius;
        this.color = color;
    }

    public void display()
    {
        p.fill(color);
        p.ellipse(positionx, positiony, radius*2, radius*2);
        positionx += velocityx;
        positiony += velocityy;

        if (positionx >= 790 || positionx <= 10)
           velocityx *= -1;
        else if(positiony >= 790|| positiony <= 10)
          velocityy *= -1;

    }

}
