package task_four; 
import java.util.Scanner; 
class vehicle 
{ 
 Scanner s1=new Scanner(System.in); 
 void getvalue() 
 { 
 System.out.println("Enter the name of the vehicle:"); 
 String name=s1.nextLine(); 
 System.out.println("Vehicle name is:"+name); 
 } 
} 
class car extends vehicle 
{ 
 void details() 
 { 
 getvalue(); 
 System.out.println("Enter the number of wheels:"); 
 int number=s1.nextInt(); 
 System.out.println("It has "+number+" wheels"); 
 } 
} 
public class single_inheritance_example { 
 public static void main(String[] args) { 
       car c1=new car(); 
       c1.details(); 
} 
}