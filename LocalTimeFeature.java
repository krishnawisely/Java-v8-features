import java.time.LocalTime;
public class Simple{
public static void main(String args[]){
LocalTime time = LocalTime.now();
LocalTime addMinutes = time.plusMinutes(1);
LocalTime addHourse = time.plusHours(1);
LocalTime minusMinutes = time.minusMinutes(1);
LocalTime minusHourse = time.minusHours(1);
LocalTime myTime = time.of(1,55,59);
System.out.println("Current Time=>"+time);
System.out.println("Current Time + 1Min=>"+addMinutes);
System.out.println("Current Time + 1Hr=>"+addHourse);
System.out.println("Current Time - 1Min=>"+minusMinutes);
System.out.println("Current Time - 1Hr=>"+minusHourse);
System.out.println("MyTime=>"+myTime);
}}
