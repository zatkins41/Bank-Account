import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
public class TestBankAccount
{


public static void main (String[] args)
{
      
   
   
   BankAccount ac1= new BankAccount (123456, 10000);
   ac1.setannualInterestRate (2.5);
   
  
    ac1.withdraw (3500);
    ac1.deposit (500);   
   System.out.println(ac1.toString());
   
   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
   Date date = new Date ();
   String dateFt = dateFormat.format(date);
   
}
}