public class LinkedList implements List {
	protected Object element;
	protected LinkedList remainder;

	public boolean isEmpty() {
		if (element == null) {
			return true;
		}
		return false;
	}

	public int size() {
    	if (isEmpty()) {
      		return 0;
    	}
    	if (remainder == null) {
    		return 1;
    	}    		
    	return 1 + remainder.size();
//recurse through items in list increasing count for each item
	}

	public ReturnObject get(int index) {
		if ((size() - 1 < index) || (index < 0)) {
			return new ReturnObjectImpl (null, ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		if (index == 0) {
			return new ReturnObjectImpl (element, ErrorMessage.NO_ERROR);
		}
		return remainder.get(index - 1);
//iterate through to index and return object
	}

	public ReturnObject remove(int index) {
		if ((size() - 1 < index) || (index < 0)) {
			return new ReturnObjectImpl (null, ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		// set this list equal to the remainder linked list, because it's the same as removing
		// the element
		if ((index == 0) && (remainder == null)) {
			Object elementCopy = element;
			element = null;
			return new ReturnObjectImpl(elementCopy, ErrorMessage.NO_ERROR);
		}
		if ((index == 0) && (remainder != null)) {
			Object elementCopy = element;
			this.element = remainder.element;
			this.remainder = remainder.remainder;
			return new ReturnObjectImpl(elementCopy, ErrorMessage.NO_ERROR);
		}
		//the element of remainder is being removed, so remainder's remainder should move up
		return remainder.remove(index - 1);
	}

	public ReturnObject add(int index, Object item) {
		if (item == null) {
			return new ReturnObjectImpl(null, ErrorMessage.INVALID_ARGUMENT);
		}
		if ((index < 0) || (index > size())) {
			return new ReturnObjectImpl(null, ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} 
		if (index == 0) {
			LinkedList copy = new LinkedList();
			copy.element = element;
			copy.remainder = remainder;
			remainder = copy;
			element = item;
			return new ReturnObjectImpl(null, ErrorMessage.NO_ERROR);
		}
		if (remainder == null) {
			remainder = new LinkedList();
		}
		return remainder.add(index - 1,item);
	}

	public ReturnObject add(Object item) {
		if (item == null) {
			return new ReturnObjectImpl(null, ErrorMessage.INVALID_ARGUMENT);
		}
		if (element == null) {
			element = item;
			return new ReturnObjectImpl(null, ErrorMessage.NO_ERROR);
		}
		if (remainder == null) {
			remainder = new LinkedList();
		}
		return remainder.add(item);
	}
}	