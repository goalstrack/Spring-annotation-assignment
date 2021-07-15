package com.fis.app.model;

import java.util.Arrays;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private Employee e[];
	private int product_id;
	private int product_name;
	private String status;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Employee[] e, int product_id, int product_name, String status) {
		super();
		this.e = e;
		this.product_id = product_id;
		this.product_name = product_name;
		this.status = status;
	}
	public Employee[] getE() {
		return e;
	}
	public void setE(Employee[] e) {
		this.e = e;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getProduct_name() {
		return product_name;
	}
	public void setProduct_name(int product_name) {
		this.product_name = product_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(e);
		result = prime * result + Objects.hash(product_id, product_name, status);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Arrays.equals(e, other.e) && product_id == other.product_id && product_name == other.product_name
				&& Objects.equals(status, other.status);
	}
	@Override
	public String toString() {
		return "Product [e=" + Arrays.toString(e) + ", product_id=" + product_id + ", product_name=" + product_name
				+ ", status=" + status + "]";
	}
	
	
}
