package de.thb.dim.pizzaPronto.controller;

import de.thb.dim.pizzaPronto.valueObjects.OrderVO;
import de.thb.dim.pizzaPronto.valueObjects.CustomerVO;
import de.thb.dim.pizzaPronto.valueObjects.DishVO;

public interface IOrdering {

	public OrderVO startNewOrder(CustomerVO acustomer) throws NullPointerException;

	public void addDish(DishVO adish) throws IllegalStateException;

	public void deleteDish(DishVO adish) throws IllegalStateException;

	public float calculateTotalPrice();

	public void_throws_IllegalStateException confirmOrder();

	public int hashCode();

	public boolean equals(Object aobject);
}