package task_four; 
import java.util.Scanner; 
class food 
{ 
 Scanner s1=new Scanner(System.in); 
 void food_details() 
 { 
  System.out.println("Enter the fav food name:"); 
  String name=s1.nextLine(); 
 } 
} 
class veg extends food 
{ 
 void veg_details() 
 { 
  food_details(); 
  System.out.println("Only veg..."); 
 } 
} 
class nonveg extends food 
{ 
 void non_veg_details() 
 { 
  food_details(); 
  System.out.println("Only non-veg..."); 
 } 
} 
public class hierarchical_inheritance
{ 
 public static void main(String[] args) { 
  veg v1=new veg(); 
  v1.veg_details(); 
  nonveg n1=new nonveg(); 
  n1.non_veg_details(); 
 } 
}