package task_four; 
import java.util.Scanner; 
class animal{ 
 Scanner s1=new Scanner(System.in); 
 void displaydetails() 
 { 
  String name; 
  System.out.println("Enter the animal name:"); 
  name=s1.nextLine(); 
 } 
} 
class mammal extends animal{ 
 void mammal_details() 
 { 
  displaydetails(); 
  System.out.println("Mammal furcolor is:"); 
  String color=s1.nextLine(); 
 } 
} 
class dog extends mammal 
{ 
 void dogdetails() 
 { 
  mammal_details(); 
  System.out.print("Dog breed is:"); 
  String breed=s1.nextLine(); 
 } 
} 
public class multilevel_inheritance
{ 
 public static void main(String[] args) 
 { 
  mammal m1=new mammal(); 
  m1.mammal_details(); 
  dog d1=new dog(); 
  d1.dogdetails(); 
 } 
}