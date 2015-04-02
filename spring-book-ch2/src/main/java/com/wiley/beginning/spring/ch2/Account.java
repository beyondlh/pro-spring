package com.wiley.beginning.spring.ch2;

import java.util.Date;

/**
 *
 * @author Благодатских С.
 */
public class Account {

	private long id;
	private String ownerName;
	private double balance;
	private Date accessTime;
	private boolean locked;

	public Account() {
	}

	public Account(long id, String ownerName) {
		this.id = id;
		this.ownerName = ownerName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getAccessTime() {
		return accessTime;
	}

	public void setAccessTime(Date accessTime) {
		this.accessTime = accessTime;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	@Override
	public String toString() {
		return "id: " + id + ", name: " + ownerName + ", balance: "
				+ balance + ", locked: " + locked;
	}

}
