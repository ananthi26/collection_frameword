package task_four;
import java.util.Scanner;
abstract class example1
{
	abstract void display();
}
class example2
{
	void display()
	{
		System.out.println("Implemented abstract class");
	}
}
public class abstract_class_example
{
	public static void main(String[] args)
	{
		example2 e1=new example2();
		e1.display();
	}
}