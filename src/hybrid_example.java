package task_four; 
import java.util.Scanner; 
class Vehicle { 
 void displayInfo() { 
     System.out.println("This is a vehicle."); 
 } 
} 
 
class Car extends Vehicle { 
 void start() { 
     System.out.println("Car engine started."); 
 } 
} 
class Bike extends Vehicle { 
 void move() { 
     System.out.println("Bike is moving."); 
 } 
} 
class HybridCarBike extends Car { 
 void move() { 
     System.out.println("Hybrid Car-Bike is moving."); 
 } 
} 
public class hybrid_example{ 
 public static void main(String[] args) { 
     HybridCarBike hybrid = new HybridCarBike(); 
     hybrid.start();   
     hybrid.move();    
     hybrid.displayInfo(); 
 } 
} 