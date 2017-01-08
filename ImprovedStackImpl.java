public class ImprovedStackImpl implements ImprovedStack {
	protected List list;

	public ImprovedStackImpl(List list) {
	  this.list = list;
    }

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int size() {
		return list.size();
	}

//top of the list is the same as the first item in the list - LIFO

	public void push(Object item) {
		list.add(0,item);
	}

	public ReturnObject top() {
		if (isEmpty()) {
			return new ReturnObjectImpl(null,ErrorMessage.EMPTY_STRUCTURE);
		}
		return list.get(0);
	}

	public ReturnObject pop() {
		if (isEmpty()) {
			return new ReturnObjectImpl(null,ErrorMessage.EMPTY_STRUCTURE);
		}
		return list.remove(0);
	}

	public ImprovedStack reverse() {
		if (isEmpty()) {
			return this;
		}
    	List listCopy = new ArrayList();
    	for (int i = list.size() - 1; i >= 0; i--) { //iterating backwards through list
    		listCopy.add(list.get(i).getReturnValue()); //adding list's last element to the beginning of copy etc
    	}
    	return new ImprovedStackImpl(listCopy);
	}

	public void remove(Object object) {
		List listCopy = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			if (!list.get(i).getReturnValue().equals(object)) {
				listCopy.add(list.get(i).getReturnValue());
			}
		}
		list = listCopy;
	}
}