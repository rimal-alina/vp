package de.thb.dim.pizzaPronto.businessObjects;

import de.thb.dim.pizzaPronto.valueObjects.MenuVO;
import de.thb.dim.pizzaPronto.valueObjects.OrderVO;
import de.thb.dim.pizzaPronto.valueObjects.CustomerVO;
import de.thb.dim.pizzaPronto.valueObjects.DishVO;
import de.thb.dim.pizzaPronto.controller.IOrdering;

/**
 * @author schmidt
 */
public class Ordering implements IOrdering {
	private static MenuVO _menu;
	private OrderVO _currentOrder;
	private CustomerVO _currentCustomer;
	private static int _nextId = 0;

	public OrderVO startNewOrder(CustomerVO acustomer) throws NullPointerException {
		throw new UnsupportedOperationException();
	}

	public void addDish(DishVO adish) throws IllegalStateException {
		throw new UnsupportedOperationException();
	}

	public void deleteDish(DishVO adish) throws IllegalStateException {
		throw new UnsupportedOperationException();
	}

	public float calculateTotalPrice() {
		throw new UnsupportedOperationException();
	}

	public int hashCode() {
		int lhashCode = 0;
		if ( this._menu != null ) {
			lhashCode += this._menu.hashCode();
		}
		if ( this._currentOrder != null ) {
			lhashCode += this._currentOrder.hashCode();
		}
		if ( this._currentCustomer != null ) {
			lhashCode += this._currentCustomer.hashCode();
		}
		if ( lhashCode == 0 ) {
			lhashCode = super.hashCode();
		}
		return lhashCode;
	}

	public boolean equals(Object aobject) {
		if (this == aobject) {
			return true;
		} else if (aobject instanceof Ordering) {
			Ordering lOrderingObject = (Ordering) aobject;
			boolean lequals = true;
			lequals &= ((this._menu == lOrderingObject._menu)
				|| (this._menu != null && this._menu.equals(lOrderingObject._menu)));
			lequals &= ((this._currentOrder == lOrderingObject._currentOrder)
				|| (this._currentOrder != null && this._currentOrder.equals(lOrderingObject._currentOrder)));
			lequals &= ((this._currentCustomer == lOrderingObject._currentCustomer)
				|| (this._currentCustomer != null && this._currentCustomer.equals(lOrderingObject._currentCustomer)));
			lequals &= this._nextId == lOrderingObject._nextId;
			return lequals;
		}
		return false;
	}

	public MenuVO getmenu() {
		return this._menu;
	}

	public void setcurrentOrder(OrderVO acurrentOrder) {
		this._currentOrder = acurrentOrder;
	}

	public OrderVO getcurrentOrder() {
		return this._currentOrder;
	}

	public void setcurrentCustomer(CustomerVO acurrentCustomer) {
		this._currentCustomer = acurrentCustomer;
	}

	public CustomerVO getcurrentCustomer() {
		return this._currentCustomer;
	}

	public int getnextId() {
		return this._nextId;
	}
}