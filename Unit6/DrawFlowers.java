
import processing.core.*;
import java.util.*;


public class DrawFlowers extends PApplet
{
  private ArrayList<Flower> flowers;

  public void settings()
      {
          size(800, 800);
      }

  public void setup()
  {
     flowers = new ArrayList<Flower>();
     createFlower();
   }


    public void createFlower()
    {
        int positionx = (int)random(1, 599);
        int positiony = (int)random(1, 599);

        int velocityx = (int)random(1, 3);
        int velocityy = (int)random(1, 3);


        float radius = random(5, 20);
        int c = color(random(256), random(256), random(256));

        Flower flower = new Flower(this,
                             positionx,
                             positiony,
                             velocityx,
                             velocityy,
                             radius,
                             c);

         flowers.add(flower);
    }

    public void draw()
    {
        background(0);
        for (Flower flower : flowers)
            flower.display();
    }

    public void keyPressed()
    {
            createFlower();
    }


    public static void main(String[] args)
    {
        PApplet.main("DrawFlowers");
    }

}
