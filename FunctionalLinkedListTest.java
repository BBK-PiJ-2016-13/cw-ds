public class FunctionalLinkedListTest {

	public static void main (String[] args) {
		FunctionalLinkedList test = new FunctionalLinkedList();
		test.add(2);
		test.add(3);
		System.out.println(test.head().getReturnValue());
		System.out.println(test.rest().head().getReturnValue());
		System.out.println(test.rest().rest().head().getReturnValue());
	}
}