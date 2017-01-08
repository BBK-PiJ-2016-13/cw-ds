public class ReturnObjectImplTest {
	public static void main (String[] args) {
		ReturnObjectImpl returnObject1 = new ReturnObjectImpl(5,ErrorMessage.NO_ERROR);
		ReturnObjectImpl returnObject2 = new ReturnObjectImpl(5,null);
		ReturnObjectImpl returnObject3 = new ReturnObjectImpl(5,ErrorMessage.EMPTY_STRUCTURE);
		ReturnObjectImpl returnObject4 = new ReturnObjectImpl(null,ErrorMessage.EMPTY_STRUCTURE);
		System.out.println (returnObject1.hasError());
		System.out.println (returnObject1.getError());
		System.out.println (returnObject1.getReturnValue());
		System.out.println (returnObject2.hasError());
		System.out.println (returnObject2.getError());
		System.out.println (returnObject2.getReturnValue());
		System.out.println (returnObject3.hasError());
		System.out.println (returnObject3.getError());
		System.out.println (returnObject3.getReturnValue());
		System.out.println (returnObject4.hasError());
		System.out.println (returnObject4.getError());
		System.out.println (returnObject4.getReturnValue());
	}
}