/* Write a program that animates something on screen. Your program
must use an external class, with a private PApplet member variable
that is set via the constructor, and a display() function to draw
the object. */



import processing.core.*;


public class Flower
{

      private PApplet p;
      private int positionx;
      private int positiony;
      private int velocityx;
      private int velocityy;
      private float radius;
      private int color;

    public Flower(PApplet p, int positionx, int positiony, int velocityx,
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
        p.ellipse(positionx + ((2 * radius)/3), positiony - ((2 * radius)/3), radius*2, radius*2);
        p.ellipse(positionx + radius, positiony + (radius/2), radius*2, radius*2);
        p.ellipse(positionx, positiony + radius, radius*2, radius*2);
        p.ellipse(positionx - radius, positiony + (radius/2), radius*2, radius*2);
        p.ellipse(positionx - ((2 * radius)/3), positiony - ((2 * radius)/3), radius*2, radius*2);
        p.ellipse(positionx, positiony, radius, radius);
        positionx += velocityx;
        positiony += velocityy;

        if (positionx >= (800 - radius) || positionx <= radius)
           velocityx *= -1;
        else if(positiony >= (800 - radius)|| positiony <= radius)
          velocityy *= -1;


    }

}
