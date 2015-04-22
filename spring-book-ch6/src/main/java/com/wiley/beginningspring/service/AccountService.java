package com.wiley.beginningspring.service;

/**
 *
 * @author Благодатских С.
 */
public interface AccountService {

	void transferMoney(long sourceAccountId, long targetAccountId, double amount);

}
