package de.thb.dim.pizzaPronto.valueObjects;

/**
 * @author Robert Fischer, Gabriele Schmidt
 * @version 0.1
 * @since 27.05.2013
 */
public class PastaVO extends DishVO {
	private static final long serialVersionUID = 1L;
	private int _typeOfPasta;

	public String getNameOfDish() {
		throw new UnsupportedOperationException();
	}

	public int getNumberOfDish() {
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
		} else if (aobject instanceof PastaVO) {
			PastaVO lPastaVOObject = (PastaVO) aobject;
			boolean lequals = true;
			lequals &= this.serialVersionUID == lPastaVOObject.serialVersionUID;
			lequals &= this._typeOfPasta == lPastaVOObject._typeOfPasta;
			return lequals;
		}
		return false;
	}

	public void settypeOfPasta(int atypeOfPasta) {
		this._typeOfPasta = atypeOfPasta;
	}

	public int gettypeOfPasta() {
		return this._typeOfPasta;
	}
}