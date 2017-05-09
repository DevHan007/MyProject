package list;

public class LinkedListMain {

	public static void main(String[] args) {

		
		LinkedList numbers = new LinkedList();
		
		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);
		
		numbers.addLast(40);
		numbers.addLast(50);
		numbers.addLast(60);
		
		
		
		//System.out.println(numbers.node(2));
		
		numbers.add(1,15);
		
		System.out.println(numbers);
		System.out.println(numbers.removeFirst());
		System.out.println(numbers.remove(1));
		System.out.println(numbers);
		System.out.println(numbers.size());
		System.out.println(numbers.get(1));
		System.out.println(numbers.indexOf(15));
		
		LinkedList.ListIterator i = numbers.listIterator();
		
		System.out.println(i.next());
		System.out.println(i.hasNext());
		
		i.add(4);
		System.out.println(numbers);
		System.out.println(i.next());
		i.add(24);
		System.out.println(numbers);
		i.remove();
		System.out.println(numbers);
	}

}




























