package de.thb.dim.pizzaPronto.valueObjects;

public class MenuVO {
	private java.util.Vector<DishVO> _dishes;

	/**
	 * Method to initialize the menu and create all objects of dishes.
	 */
	private void initMenu() {
		throw new UnsupportedOperationException();
	}

	/**
	 * // Getter und Setter/
	 */
	public DishVO getDish(int aindex) {
		throw new UnsupportedOperationException();
	}

	public int hashCode() {
		int lhashCode = 0;
		if ( this._dishes != null ) {
			lhashCode += this._dishes.hashCode();
		}
		if ( lhashCode == 0 ) {
			lhashCode = super.hashCode();
		}
		return lhashCode;
	}

	public boolean equals(Object aobject) {
		if (this == aobject) {
			return true;
		} else if (aobject instanceof MenuVO) {
			MenuVO lMenuVOObject = (MenuVO) aobject;
			boolean lequals = true;
			lequals &= ((this._dishes == lMenuVOObject._dishes)
				|| (this._dishes != null && this._dishes.equals(lMenuVOObject._dishes)));
			return lequals;
		}
		return false;
	}
}