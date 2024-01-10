package de.thb.dim.pizzaPronto.valueObjects;

/**
 * PersonVO is the superclass containing basic attributes
 * 
 * @author Gabriele Schmidt
 * @version 2.0
 * @since 22.03.2020
 */
public abstract class PersonVO {
	protected String _lastName;
	protected String _firstName;
	protected String _street;
	protected int _houseNumber;
	private static final long serialVersionUID = 1L;
	protected String _fullName;

	public int hashCode() {
		int lhashCode = 0;
		if ( this._lastName != null ) {
			lhashCode += this._lastName.hashCode();
		}
		if ( this._firstName != null ) {
			lhashCode += this._firstName.hashCode();
		}
		if ( this._street != null ) {
			lhashCode += this._street.hashCode();
		}
		if ( this._fullName != null ) {
			lhashCode += this._fullName.hashCode();
		}
		if ( lhashCode == 0 ) {
			lhashCode = super.hashCode();
		}
		return lhashCode;
	}

	public boolean equals(Object aobject) {
		if (this == aobject) {
			return true;
		} else if (aobject instanceof PersonVO) {
			PersonVO lPersonVOObject = (PersonVO) aobject;
			boolean lequals = true;
			lequals &= ((this._lastName == lPersonVOObject._lastName)
				|| (this._lastName != null && this._lastName.equals(lPersonVOObject._lastName)));
			lequals &= ((this._firstName == lPersonVOObject._firstName)
				|| (this._firstName != null && this._firstName.equals(lPersonVOObject._firstName)));
			lequals &= ((this._street == lPersonVOObject._street)
				|| (this._street != null && this._street.equals(lPersonVOObject._street)));
			lequals &= this._houseNumber == lPersonVOObject._houseNumber;
			lequals &= this.serialVersionUID == lPersonVOObject.serialVersionUID;
			lequals &= ((this._fullName == lPersonVOObject._fullName)
				|| (this._fullName != null && this._fullName.equals(lPersonVOObject._fullName)));
			return lequals;
		}
		return false;
	}

	public void setlastName(String alastName) {
		this._lastName = alastName;
	}

	public String getlastName() {
		return this._lastName;
	}

	public void setfirstName(String afirstName) {
		this._firstName = afirstName;
	}

	public String getfirstName() {
		return this._firstName;
	}

	public void setstreet(String astreet) {
		this._street = astreet;
	}

	public String getstreet() {
		return this._street;
	}

	public void sethouseNumber(int ahouseNumber) {
		this._houseNumber = ahouseNumber;
	}

	public int gethouseNumber() {
		return this._houseNumber;
	}

	public void setfullName(String afullName) {
		this._fullName = afullName;
	}

	public String getfullName() {
		return this._fullName;
	}
}