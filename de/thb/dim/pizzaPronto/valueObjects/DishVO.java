package de.thb.dim.pizzaPronto.valueObjects;

public abstract class DishVO {
	private static final long serialVersionUID = 1L;
	private int _typeOfPasta;

	/**
	 * Abstract method of returning the name of the dish as in menu. Must be overridden by the derived classes.
	 * @return - name of the dish
	 */
	public abstract String getNameOfDish();

	/**
	 * Abstract method of returning the number of the dish as in menu. Must be overridden by the derived classes.
	 * @return - number of the dish
	 */
	public abstract int getNumberOfDish();

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
		} else if (aobject instanceof DishVO) {
			DishVO lDishVOObject = (DishVO) aobject;
			boolean lequals = true;
			lequals &= this.serialVersionUID == lDishVOObject.serialVersionUID;
			lequals &= this._typeOfPasta == lDishVOObject._typeOfPasta;
			return lequals;
		}
		return false;
	}
}