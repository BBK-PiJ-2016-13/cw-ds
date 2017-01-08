public class SampleableListTest {
	public static void main (String[] args) {
		SampleableList sList = new SampleableListImpl();
		sList.add(3);
		sList.add(4);
		sList.add(5);
		sList = sList.sample();
		System.out.println (sList.size());
		System.out.println (sList.get(0).getReturnValue());
		System.out.println (sList.get(1).getReturnValue());
		System.out.println (sList.get(2).getReturnValue());
	}
}