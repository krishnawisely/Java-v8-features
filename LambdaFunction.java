//Lambda function feature

interface Vechicle{
void car();
}
public class Simple{
public static void main(String args[]){
Vechicle vechicle = () -> { //Here lambda function
System.out.print("This is car!");
};
vechicle .car();
}
}
