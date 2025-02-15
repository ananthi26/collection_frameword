package task_four;
import java.util.Scanner;
class method_overring_example
{
public void display()
{
	int amount;
	int no_of_days;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the amount:");
	amount=s1.nextInt();
	System.out.println("Enter the number of days:");
	no_of_days=s1.nextInt();
	System.out.println("Total rent is:"+(amount*no_of_days));
}
}
class normal extends method_overring_example
{
	public void display()
	{
		int amount;
		int no_of_days;
		int discount;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the amount:");
		amount=s1.nextInt();
		System.out.println("Enter the number of days:");
		no_of_days=s1.nextInt();
		System.out.println("Enter the discont:");
        discount=s1.nextInt();
		System.out.println("Total rent is:"+(amount*no_of_days-discount));
	}
}
public class method_overriding
{
	public static void main(String[] args)
	{
		System.out.println("Method overring:");
		example2 e2=new example2();
		e2.display();
	}
}