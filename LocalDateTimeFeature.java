import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Simple{
public static DateTimeFormatter formatter(String format)
{
DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
return formatter;
}
public static void main(String args[]){
LocalDateTime dateTime = LocalDateTime.now();
System.out.println("DateTime=>"+dateTime);
DateTimeFormatter dateWithTime = Simple.formatter("dd:MM:yyyy HH:mm:ss");
String currentDateTime = dateTime.format(dateWithTime);
System.out.println("DD:MM:YYYY HH:MM:SS=>"+currentDateTime);
DateTimeFormatter dateOnly = Simple.formatter("dd:MM:yyyy");
String currentDate = dateTime.format(dateOnly);
System.out.println("DD:MM:YYYY=>"+currentDate);
}}
