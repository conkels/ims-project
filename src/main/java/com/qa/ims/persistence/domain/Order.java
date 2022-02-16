package com.qa.ims.persistence.domain;

import java.util.ArrayList;
import java.util.Objects;

public class Order {

	private Long order_id;
	private Customer customer;
	private ArrayList<Item> items = new ArrayList<Item>();
	private Double cost;
	private Long qty;
	public Order(Customer customer, ArrayList<Item> items, Double cost, Long qty) {
		super();
		this.customer = customer;
		this.items = items;
		this.cost = cost;
		this.qty = qty;
	}
	public Order(Long order_id, Customer customer, ArrayList<Item> items, Double cost, Long qty) {
		super();
		this.order_id = order_id;
		this.customer = customer;
		this.items = items;
		this.cost = cost;
		this.qty = qty;
	}
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
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
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Long getQty() {
		return qty;
	}
	public void setQty(Long qty) {
		this.qty = qty;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cost, customer, items, order_id, qty);
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
				&& Objects.equals(qty, other.qty);
	}
	
	
	
}
