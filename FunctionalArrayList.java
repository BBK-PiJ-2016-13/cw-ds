public class FunctionalArrayList extends ArrayList implements FunctionalList {

    public ReturnObject head() {
    	if (isEmpty()) {
			return new ReturnObjectImpl(null, ErrorMessage.EMPTY_STRUCTURE);
		} 
    	return new ReturnObjectImpl(data[0],ErrorMessage.NO_ERROR);
    }

    public FunctionalList rest() {
    	if (isEmpty()) {
			return new FunctionalArrayList();
		}
    	FunctionalArrayList dataCopy = new FunctionalArrayList();
    	for (int i = 0; i < data.length; i++) {
    		dataCopy.add(data[i]);
    	}
    	dataCopy.remove(0);
    	return dataCopy;
    }

}
