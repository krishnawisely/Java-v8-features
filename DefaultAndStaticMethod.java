interface Vehicle{
default void car()// Default method for avoid to write implemention in subclass
{
System.out.println("This is car");
}
static void bike()// This is for avoid conflict(same method repeats in both interface compiler will get confused)
{
System.out.println("This is bike");
}
}
public class Simple implements Vehicle{
public static void main(String atgs[])
{
Simple v = new Simple();
v.car();
Vehicle.bike();
}}
