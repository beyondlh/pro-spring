package com.wiley.beginning.spring.ch2;

/**
 *
 * @author Благодатских С.
 */
public interface AccountService {

	void transferMoney(long sourceAccountId,
			long targetAccountId, double amount);

	void depositMoney(long accountId, double amount) throws Exception;

	Account getAccount(long accountId);

}
