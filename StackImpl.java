public class StackImpl extends AbstractStack {
	
	public StackImpl(List list) {
	  super (list);
    }

	public boolean isEmpty() {
		return internalList.isEmpty();
	}

	public int size() {
		return internalList.size();
	}

//top of the list is the same as the first item in the list - LIFO

	public void push(Object item) {
		internalList.add(0,item);
	}

	public ReturnObject top() {
		if (isEmpty()) {
			return new ReturnObjectImpl(null,ErrorMessage.EMPTY_STRUCTURE);
		}
		return(internalList.get(0));
	}

	public ReturnObject pop() {
		if (isEmpty()) {
			return new ReturnObjectImpl(null,ErrorMessage.EMPTY_STRUCTURE);
		}
		return(internalList.remove(0));
	}

}