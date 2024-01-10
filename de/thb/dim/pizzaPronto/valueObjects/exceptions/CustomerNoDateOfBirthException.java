package de.thb.dim.pizzaPronto.valueObjects.exceptions;

public class CustomerNoDateOfBirthException {
	private static final long serialVersionUID = -3319565690504052208L;

	/**
	 * Initialize Exception
	 */
	public CustomerNoDateOfBirthException() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Initialize detailMessage
	 */
	public CustomerNoDateOfBirthException(String amessage) {
		throw new UnsupportedOperationException();
	}

	public int hashCode() {
		int lhashCode = 0;
		if ( lhashCode == 0 ) {
			lhashCode = super.hashCode();
		}
		return lhashCode;
	}

	public boolean equals(Object aobject) {
		if (this == aobject) {
			return true;
		} else if (aobject instanceof CustomerNoDateOfBirthException) {
			CustomerNoDateOfBirthException lCustomerNoDateOfBirthExceptionObject = (CustomerNoDateOfBirthException) aobject;
			boolean lequals = true;
			lequals &= this.serialVersionUID == lCustomerNoDateOfBirthExceptionObject.serialVersionUID;
			return lequals;
		}
		return false;
	}
}