//Functional interface feature
@FunctionalInterface
interface Vechicle{
int a = 10;
void car();//Abstract method
//It contain any number of object class methods
String toString();
}
public class Simple{
public static void main(String args[]){
Vechicle vechicle = () -> { //Here lambda function
System.out.println("This is car!");
};
vechicle.car();
System.out.println(Vechicle.a);
}
}
