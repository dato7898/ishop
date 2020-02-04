package net.devstudy.ishop.model;

import java.io.Serializable;

public class ShoppingCartItem implements Serializable {
	private int idProduct;
	private int count;

	public ShoppingCartItem(int idProduct, int count) {
		super();
		this.idProduct = idProduct;
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public String toString() {
		return String.format("ShoppingCartItem [idProduct=%s, count=%s]", idProduct, count);
	}
}
