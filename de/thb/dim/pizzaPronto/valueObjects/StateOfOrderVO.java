package de.thb.dim.pizzaPronto.valueObjects;

public enum StateOfOrderVO {

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
		} else if (aobject instanceof StateOfOrderVO) {
			StateOfOrderVO lStateOfOrderVOObject = (StateOfOrderVO) aobject;
			boolean lequals = true;
			return lequals;
		}
		return false;
	}
}