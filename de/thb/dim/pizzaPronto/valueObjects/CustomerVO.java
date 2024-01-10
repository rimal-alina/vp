package de.thb.dim.pizzaPronto.valueObjects;

import java.time.LocalDate;

/**
 * CustomerVO represents objects of customer.
 * @author Robert Fischer, Gabriele Schmidt
 * @version 3.0
 */
public class CustomerVO extends PersonVO {
	private static final long serialVersionUID = 1L;
	private static int _nextId = 0;
	private int _id;
	private LocalDate _dateOfBirth;
	private OrderVO _order;

	public int hashCode() {
		int lhashCode = 0;
		if ( this._dateOfBirth != null ) {
			lhashCode += this._dateOfBirth.hashCode();
		}
		if ( this._order != null ) {
			lhashCode += this._order.hashCode();
		}
		if ( lhashCode == 0 ) {
			lhashCode = super.hashCode();
		}
		return lhashCode;
	}

	public boolean equals(Object aobject) {
		if (this == aobject) {
			return true;
		} else if (aobject instanceof CustomerVO) {
			CustomerVO lCustomerVOObject = (CustomerVO) aobject;
			boolean lequals = true;
			lequals &= this.serialVersionUID == lCustomerVOObject.serialVersionUID;
			lequals &= this._nextId == lCustomerVOObject._nextId;
			lequals &= this._id == lCustomerVOObject._id;
			lequals &= ((this._dateOfBirth == lCustomerVOObject._dateOfBirth)
				|| (this._dateOfBirth != null && this._dateOfBirth.equals(lCustomerVOObject._dateOfBirth)));
			lequals &= ((this._order == lCustomerVOObject._order)
				|| (this._order != null && this._order.equals(lCustomerVOObject._order)));
			return lequals;
		}
		return false;
	}

	public int getnextId() {
		return this._nextId;
	}

	public int getid() {
		return this._id;
	}

	public void setdateOfBirth(LocalDate adateOfBirth) {
		this._dateOfBirth = adateOfBirth;
	}

	public LocalDate getdateOfBirth() {
		return this._dateOfBirth;
	}

	public void setorder(OrderVO aorder) {
		this._order = aorder;
	}

	public OrderVO getorder() {
		return this._order;
	}
}