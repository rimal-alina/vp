package de.thb.dim.pizzaPronto.valueObjects.exceptions;

public class CustomerTooYoungException {
	private static final long serialVersionUID = -5165067382209404005L;

	/**
	 * Initialize Exception
	 */
	public CustomerTooYoungException() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Initialize detailMessage
	 */
	public CustomerTooYoungException(String amessage) {
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
		} else if (aobject instanceof CustomerTooYoungException) {
			CustomerTooYoungException lCustomerTooYoungExceptionObject = (CustomerTooYoungException) aobject;
			boolean lequals = true;
			lequals &= this.serialVersionUID == lCustomerTooYoungExceptionObject.serialVersionUID;
			return lequals;
		}
		return false;
	}
}