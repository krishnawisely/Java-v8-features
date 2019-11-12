import java.time.LocalDate;
public class Simple{
public static void main(String args[]){
LocalDate todayDate = LocalDate.now();
LocalDate yesterDay = todayDate.minusDays(1);
LocalDate tommorow= todayDate.plusDays(1);
System.out.println("Today Date->"+todayDate);
System.out.println("Yesterday Date->"+yesterDay);
System.out.println("Tommorow Date->"+tommorow);
System.out.println("Is Today Leap Year->"+todayDate.isLeapYear());
}}
