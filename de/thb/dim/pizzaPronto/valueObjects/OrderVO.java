package de.thb.dim.pizzaPronto.valueObjects;

import java.time.LocalDateTime;

/**
 * The class OrderVO contains the begin and the end, i.e. delivery, of order as
 * a date timestamp Furthermore the class provides an objectmamagement of the
 * ordered pizzas (later dishes). The order has an identifiers.
 * 
 * @author Gabriele Schmidt
 * @version 2.0
 */
public class OrderVO {
	private static final long serialVersionUID = 1L;
	private int _orderNo;
	private StateOfOrderVO _state;
	private LocalDateTime _timestampStartedOrder;
	private LocalDateTime _timestampDeliveredOrder;
	private java.util.Vector<DishVO> _shoppingBasket;
	private CustomerVO _customer;

	/**
	 * Methode for adding a dish to the shopping basket of OrderVO. Object isinserted in the position index, if the maximum number yet was not reached.
	 * @param adish - the to be added dish
	 */
	public void addDish(DishVO adish) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Methode for deleting the dish from the shoppingbasket of OrderVO at the index
	 */
	public void deleteDish(int aindex) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Methode for deleting the dish from the shoppingbaske of OrderVO.
	 */
	public void deleteDish(DishVO adish) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Calculates the total price of the order.
	 * @return - totalPrice
	 */
	public float calculatePriceDishes() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Method returns the dish at the position of index.
	 * @param aindex - Index
	 * @return - objects of PizzaVO later Dishes, is null if no object exists on position index
	 */
	public DishVO getDish(int aindex) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Method returns number of dishes
	 * @return - number of pizzas
	 */
	public int getNumberOfDishes() {
		throw new UnsupportedOperationException();
	}

	public int hashCode() {
		int lhashCode = 0;
		if ( this._state != null ) {
			lhashCode += this._state.hashCode();
		}
		if ( this._timestampStartedOrder != null ) {
			lhashCode += this._timestampStartedOrder.hashCode();
		}
		if ( this._timestampDeliveredOrder != null ) {
			lhashCode += this._timestampDeliveredOrder.hashCode();
		}
		if ( this._shoppingBasket != null ) {
			lhashCode += this._shoppingBasket.hashCode();
		}
		if ( this._customer != null ) {
			lhashCode += this._customer.hashCode();
		}
		if ( lhashCode == 0 ) {
			lhashCode = super.hashCode();
		}
		return lhashCode;
	}

	public boolean equals(Object aobject) {
		if (this == aobject) {
			return true;
		} else if (aobject instanceof OrderVO) {
			OrderVO lOrderVOObject = (OrderVO) aobject;
			boolean lequals = true;
			lequals &= this.serialVersionUID == lOrderVOObject.serialVersionUID;
			lequals &= this._orderNo == lOrderVOObject._orderNo;
			lequals &= ((this._state == lOrderVOObject._state)
				|| (this._state != null && this._state.equals(lOrderVOObject._state)));
			lequals &= ((this._timestampStartedOrder == lOrderVOObject._timestampStartedOrder)
				|| (this._timestampStartedOrder != null && this._timestampStartedOrder.equals(lOrderVOObject._timestampStartedOrder)));
			lequals &= ((this._timestampDeliveredOrder == lOrderVOObject._timestampDeliveredOrder)
				|| (this._timestampDeliveredOrder != null && this._timestampDeliveredOrder.equals(lOrderVOObject._timestampDeliveredOrder)));
			lequals &= ((this._shoppingBasket == lOrderVOObject._shoppingBasket)
				|| (this._shoppingBasket != null && this._shoppingBasket.equals(lOrderVOObject._shoppingBasket)));
			lequals &= ((this._customer == lOrderVOObject._customer)
				|| (this._customer != null && this._customer.equals(lOrderVOObject._customer)));
			return lequals;
		}
		return false;
	}

	public int getorderNo() {
		return this._orderNo;
	}

	public void setstate(StateOfOrderVO astate) {
		this._state = astate;
	}

	public StateOfOrderVO getstate() {
		return this._state;
	}

	public void settimestampStartedOrder(LocalDateTime atimestampStartedOrder) {
		this._timestampStartedOrder = atimestampStartedOrder;
	}

	public LocalDateTime gettimestampStartedOrder() {
		return this._timestampStartedOrder;
	}

	public void settimestampDeliveredOrder(LocalDateTime atimestampDeliveredOrder) {
		this._timestampDeliveredOrder = atimestampDeliveredOrder;
	}

	public LocalDateTime gettimestampDeliveredOrder() {
		return this._timestampDeliveredOrder;
	}

	public void setcustomer(CustomerVO acustomer) {
		this._customer = acustomer;
	}

	public CustomerVO getcustomer() {
		return this._customer;
	}
}