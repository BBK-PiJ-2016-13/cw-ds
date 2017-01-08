public class SampleableListImpl extends ArrayList implements SampleableList {
	public SampleableList sample() {
		//create blank sampleablelist copy
		SampleableListImpl selectionCopy = new SampleableListImpl();
		//use get to get each of the odd indexed elements of the list and add(Object) them to copy
		for (int i = 0; i < size(); i += 2) {
			selectionCopy.add(get(i).getReturnValue());
		}
		//return copy
		return selectionCopy;
	}
}