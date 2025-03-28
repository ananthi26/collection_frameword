package task_four; 
import java.util.Scanner; 
class polymorphism_example{ 
void display(int a) 
{ 
 System.out.println("A value is:"+a); 
} 
void display(double d,double e) 
{ 
 System.out.println("Addition is:"+(d+e)); 
} 
void display(float a,float b) 
{ 
 System.out.println("Multiplication is:"+(a*b)); 
} 
} 
public class method_overloading
{ 
 public static void main(String[] args) 
 { 
  polymorphism_example p1=new polymorphism_example(); 
  p1.display(10); 
  p1.display(23, 10); 
  p1.display(1.2,3.4); 
 } 
}