/* Write the following concrete classes implementing the Vehicle interface:
Car, Motorcycle, Bicycle, Unicycle

Write a VehicleTest class to show that your classes are behaving properly. A
simple test is sufficient: create an ArrayList of various Vehicle objects and
iterate through it, printing info about each object.

Write a VehicleStats class that calculates various things about a list of Vehicle
 objects. Include these functions:

a function that takes an ArrayList of Vehicle objects and computes the total
number of wheels

a function that takes an ArrayList of Vehicle objects as input, and returns an
ArrayList of Vehicle objects representing those vehicles that are human-powered.

Write tests for your VehicleStats functions to demonstrate that they are
returning the expected things. */

public interface Vehicle
{
    public String name();
    public int wheelCount();
    public boolean isHumanPowered();
}
