package com.itutry.exer.exer6;

public class Order {

	private int orderId;
	private String orderName;
	

	public Order(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj instanceof Order) {
			Order o = (Order)obj;
			return this.orderId == o.orderId && this.orderName.equals(o.orderName);
		}
		return false;
	}
}
