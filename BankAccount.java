import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
public class BankAccount
{

   private int id;
   private double balance;
   private double annualInterestRate, withdrawn,deposit;
   private Date dateCreated;
   
   //Default Constructor
   public BankAccount()
   {
      this.dateCreated = new Date();
      this.id = 0;
      this.balance = 0;
   }
   //Overloaded Constructor
   public BankAccount(int id, double balance)
   {   
      this.dateCreated = new Date();
      this.id = id;
      this.balance = balance;
      
            //this.dateCreated = new Date();  
   }
   public void setid(int num1) {id = num1;}
   public int getid()
   {
      return id;
   }
   
   public void setbalance(double num2) 
   {
      balance = num2;
   }
   public double getbalance()
   {
      return balance ;
   }
      
   public void setannualInterestRate(double num3) {annualInterestRate = num3;}
   public double getannualInterestRate(){
      return annualInterestRate;}

   public Date dateCreated()
   {
      return dateCreated;
   }   
   public double getMonthlyInterestRate()
   {
      return (annualInterestRate / 12) * 100 ;
   }
   public double getMonthlyInterest()
   {
      double monthlyInterest = (getMonthlyInterestRate() / 100) * this.balance;
      return monthlyInterest;
   }
   public double withdraw(double amountTaken)
   {
      this.balance = this.balance - amountTaken;
      return this.balance;
   }     
   public double deposit(double amountAdded)
   {
      this.balance = this.balance + amountAdded;
      return this.balance; 
   } 
   
   public String toString()
   { 
    return ("Account ID:      " + id + "\nAccount Balance:    $ " + "%.2F".format(Double.toString(balance)) + "\nInterest Rate:      " + annualInterestRate + "\nDate Opened:      " + dateCreated);
   }      
}
     
   
