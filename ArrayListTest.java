public class ArrayListTest {
	public static void main (String[] args) {
		ArrayList arrayList1 = new ArrayList();
		arrayList1.add(2);
		arrayList1.add(3);
		System.out.println (arrayList1.size());
		arrayList1.add(4);
		System.out.println(arrayList1.add(null).getError());
		ArrayList arrayList2 = new ArrayList();
		System.out.println (arrayList1.isEmpty());
		System.out.println (arrayList1.size());
//		System.out.println (arrayList1.get(1));
		System.out.println (arrayList2.isEmpty());
		System.out.println (arrayList2.size());
//		System.out.println (arrayList2.get(1));
		arrayList2.add(0,9);
		System.out.println (arrayList2.isEmpty());
		System.out.println (arrayList2.size());
		arrayList1.add(1,7);
		System.out.println (arrayList1.get(1).getReturnValue());
		arrayList1.remove(1);
		System.out.println (arrayList1.get(1).getReturnValue());
		System.out.println(arrayList1.remove(6).getError());
		FunctionalArrayList farrayList1 = new FunctionalArrayList();
		farrayList1.add(2);
		farrayList1.add(3);
		System.out.println(farrayList1.head().getReturnValue());
		System.out.println(farrayList1.rest().head().getReturnValue());
		System.out.println(farrayList1.rest().rest().head().getReturnValue());
		farrayList1.add(2);
		System.out.println (farrayList1.size());
		farrayList1.add(9);
		System.out.println (farrayList1.size());
		farrayList1.add(2);
		System.out.println (farrayList1.size());
		farrayList1.add(9);
		System.out.println (farrayList1.size());
		farrayList1.add(2);
		System.out.println (farrayList1.size());
		farrayList1.add(9);
		System.out.println (farrayList1.size());
		farrayList1.add(2);
		System.out.println (farrayList1.size());
		farrayList1.add(9);
		System.out.println (farrayList1.size());
		
		farrayList1.add(0,2);
		System.out.println (farrayList1.size());
		farrayList1.add(0,9);
		System.out.println (farrayList1.size());
		farrayList1.add(0,2);
		System.out.println (farrayList1.size());
		farrayList1.add(0,9);
		System.out.println (farrayList1.size());
		farrayList1.add(0,2);
		System.out.println (farrayList1.size());
		farrayList1.add(0,9);


	}
}
