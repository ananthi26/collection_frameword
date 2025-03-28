package task_7;
import java.util.*;
public class collection_framework_example {
    public static void main(String[] args) {
	List<String> arraylist=new ArrayList<>();
	arraylist.add("Apple");
	arraylist.add("Banana");
	arraylist.add("Mango");
    System.out.println("Array List:"+arraylist);
	
	LinkedList<Integer> list=new LinkedList<>();
	list.add(20);
	list.add(30);
	list.addFirst(10);
	System.out.println("Linked List:"+list);
	
	Set<String> hashset=new HashSet<>();
	hashset.add("Lion");
	hashset.add("Tiger");
	hashset.add("Dog");
	System.out.println("Hash Set:"+hashset);
	
	TreeSet<Integer> tset=new TreeSet<>();
	tset.add(10);
	tset.add(20);
	tset.add(5);
	System.out.println("Tree Set:"+tset);
	
	Queue<String> queue=new LinkedList<>();
	queue.add("Red");
	queue.add("Purple");
	queue.add("Black");
	queue.poll();
	System.out.println("Queue Elements are:"+queue);
	
	Stack<Integer> stack=new Stack<>();
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	stack.pop();
	System.out.println("Stack Elements are:"+stack);
	
}
}
