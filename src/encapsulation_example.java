package task_four; 
import java.util.Scanner; 
class bank 
{ 
 private int account_number; 
 
 public int getAccount_number() { 
  return account_number; 
 } 
 
 public void setAccount_number(int account_number) { 
  this.account_number = account_number; 
 } 
 public void display_Account_number() { 
      System.out.println("Account number is:"+account_number); 
 } 
} 
public class encapsulation_example
{ 
 public static void main(String[] args) 
 { 
  bank b1=new bank(); 
  b1.getAccount_number(); 
  b1.setAccount_number(1234567890); 
  b1.display_Account_number(); 
 } 
} 