public class ArrayList implements List {
	protected Object[] data;

	public ArrayList() {
		data = new Object[100];
	}

	public boolean isEmpty() {
		if (data[0] == null) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		int count = 0;
		for (Object x : data) {
			if (x != null) {
				count++;
			}
		}
		return count;
	}

	public ReturnObject get(int index) {
		if ((index < 0) || (index > size())) {
			return new ReturnObjectImpl(null,ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			return new ReturnObjectImpl(data[index],ErrorMessage.NO_ERROR);
		}
	}

	public ReturnObject remove(int index) {
		Object removed = data[index];
		if ((index < 0) || (index > size())) {
			return new ReturnObjectImpl(null, ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		for (int i = index; i < size(); i++) {
			if (data[i] != null) {
				data[i] = data[i + 1];
			}
		}
		return new ReturnObjectImpl(removed,ErrorMessage.NO_ERROR);
	}

	public ReturnObject add(int index, Object item) {
		if (item == null) {
			return new ReturnObjectImpl(null, ErrorMessage.INVALID_ARGUMENT);
		}
		if ((index < 0) || (index > size())) {
			return new ReturnObjectImpl(null, ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} 
		for (int i = size(); i > index; i--) {
			data[i] = data[i-1]; //dist from end
		}
		data[index] = item;
		return new ReturnObjectImpl(null,ErrorMessage.NO_ERROR);
	}

	public ReturnObject add(Object item) {
		if (item == null) {
			return new ReturnObjectImpl(null, ErrorMessage.INVALID_ARGUMENT);
		} else {
			data[size()] = item;
			return new ReturnObjectImpl(null,ErrorMessage.NO_ERROR);
		}
	}

}
