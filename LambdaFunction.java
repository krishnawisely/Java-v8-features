//Lambda function feature
//Used for implement SAM->Single Abstract Method interface
interface Vehicle{
void car();
}
public class Simple{
public static void main(String args[]){
Vehicle vehicle = () -> { //Here lambda function
System.out.print("This is car!");
};
//Or
//Vehicle vehicle = () -> System.out.print("This is car!");//Here lambda function
vehicle.car();
}
}
