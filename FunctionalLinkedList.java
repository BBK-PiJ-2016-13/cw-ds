public class FunctionalLinkedList extends LinkedList implements FunctionalList {

    public ReturnObject head() {
    	if (isEmpty()) {
			return new ReturnObjectImpl(null, ErrorMessage.EMPTY_STRUCTURE);
		} 
    	return new ReturnObjectImpl(element,ErrorMessage.NO_ERROR);
    }

    public FunctionalList rest() {
    	if (isEmpty()) {
			return new FunctionalLinkedList();
		}
    	FunctionalLinkedList dataCopy = new FunctionalLinkedList();
    	for (int i = 1; i < size(); i++) {
    	 	dataCopy.add(get(i).getReturnValue());
    	}
    	return dataCopy;
    }

}
