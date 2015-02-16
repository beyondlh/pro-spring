package com.apress.springrecipes.shop;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class Battery extends Product {

	private boolean rechargeable;

	public Battery() {
	}

	public Battery(String name, double price) {
		super(name, price);
	}

	public boolean isRechargeable() {
		return rechargeable;
	}

	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}

	@Override
	public String toString() {
		return super.toString() + " " + rechargeable;
	}

}
