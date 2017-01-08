public class LinkedListTest {

	public static void main (String[] args) {
		LinkedList test = new LinkedList();
		System.out.println(test.isEmpty());
		System.out.println(test.size());
		test.add(7);
		System.out.println(test.size());
		test.add(6);
		System.out.println(test.size());
		System.out.println(test.get(1).getReturnValue());
		System.out.println(test.get(2).getError());
		test.add(2,5);
		System.out.println(test.size());
		System.out.println(test.get(1).getReturnValue());
		System.out.println(test.get(2).getReturnValue());
		System.out.println(test.remove(0).getReturnValue());
		System.out.println(test.get(1).getReturnValue());
		System.out.println(test.get(2).getReturnValue());
		System.out.println(test.remove(1).getReturnValue());
		System.out.println(test.get(0).getReturnValue());
		
		test.add("Foo");
		test.add("Bar");
		System.out.println(test.remove(1).getReturnValue());
		System.out.println(test.get(0).getReturnValue());
		System.out.println(test.get(1).getError());
	}
}