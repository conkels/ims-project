package com.qa.ims.persistence.domain;

import java.util.ArrayList;
import java.util.Objects;

public class Order {

	private Long order_id;
	private Double cost;
	private Long quantity;
	private Customer customer;
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public Order(Double cost, Long quantity, Customer customer, ArrayList<Item> items) {
		super();
		this.cost = cost;
		this.quantity = quantity;
		this.customer = customer;
		this.items = items;
	}

	public Order(Long order_id, Double cost, Long quantity, Customer customer, ArrayList<Item> items) {
		super();
		this.order_id = order_id;
		this.cost = cost;
		this.quantity = quantity;
		this.customer = customer;
		this.items = items;
	}

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, customer, items, order_id, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(cost, other.cost) && Objects.equals(customer, other.customer)
				&& Objects.equals(items, other.items) && Objects.equals(order_id, other.order_id)
				&& Objects.equals(quantity, other.quantity);
	}
	
	
	
	
	
}
