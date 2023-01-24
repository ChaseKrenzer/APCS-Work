/*Write a VehicleStats class that calculates various things about a list of
Vehicle objects. Include these functions:

a function that takes an ArrayList of Vehicle objects and computes the total
number of wheels

a function that takes an ArrayList of Vehicle objects as input, and returns an
ArrayList of Vehicle objects representing those vehicles that are human-powered.

Write tests for your VehicleStats functions to demonstrate that they are
returning the expected things. */


import java.util.*;

public class VehicleStats
{
    public static int TotalWheels(ArrayList <Vehicle> vehicles){
      int i = 0;
      for (Vehicle v : vehicles)
          i += v.wheelCount();
      return i;
    }

    public static ArrayList HumPowered(ArrayList <Vehicle> vehicles){
      ArrayList<Vehicle> h = new ArrayList<Vehicle>();
      for (Vehicle v : vehicles)
        if (v.isHumanPowered() == true){
          h.add(v);
        }
        return h;
    }


    public static void main(String[] args)
      {
          ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

          Car c1 = new Car ();
          vehicles.add(c1);

          Motorcycle m1 = new Motorcycle ();
          vehicles.add(m1);

          Bicycle b1 = new Bicycle ();
          vehicles.add(b1);

          Unicycle u1 = new Unicycle ();
          vehicles.add(u1);

        System.out.println("Total Wheels: " + TotalWheels(vehicles) +
             " Human Powered Vehicles: " + HumPowered(vehicles));

        }
}
