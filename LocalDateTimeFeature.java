import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Simple{
public static void main(String args[]){
LocalDateTime dateTime = LocalDateTime.now();
System.out.println("DateTime=>"+dateTime);
DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm:ss");
String currentDateTime = dateTime.format(dateFormat);
System.out.println("DD:MM:YYYY HH:MM:SS=>"+currentDateTime);
}}
