public class ReturnObjectImpl implements ReturnObject {

	private Object returnValue;
	private ErrorMessage error;

	public ReturnObjectImpl(Object returnValue, ErrorMessage error) {
		this.returnValue = returnValue;
		this.error = error; //note if error = null, treat it as an actual error
							//in this case getError returns null
	}

	public boolean hasError() {
		if (error == ErrorMessage.NO_ERROR) {
			return false;
		} else {
			return true;
		}
	}

	public ErrorMessage getError() {
		return error;
	}

	public Object getReturnValue() {
		if (hasError()) {
			return null; 
		} else {
			return returnValue;
		}
		
	}

}