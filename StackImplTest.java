public class StackImplTest {

		public static void main (String[] args) {
			ArrayList list = new ArrayList();
			StackImpl test = new StackImpl(list);
			System.out.println (test.isEmpty());
			System.out.println (test.size());
			test.push(null);
			test.push(1);
			System.out.println (test.size());
			test.push(2);
			test.push(3);
			System.out.println (test.size());
			System.out.println (test.top().getReturnValue());
			System.out.println (test.pop().getReturnValue());
			System.out.println (test.top().getReturnValue());
			System.out.println (test.pop().getReturnValue());
			System.out.println (test.top().getReturnValue());
			System.out.println (test.pop().getReturnValue());
			System.out.println (test.top().getReturnValue());
			System.out.println (test.pop().getError());
			System.out.println (test.top().getError());
		}
}