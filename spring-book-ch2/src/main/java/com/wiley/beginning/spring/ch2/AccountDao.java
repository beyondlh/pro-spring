package com.wiley.beginning.spring.ch2;

import java.util.List;

/**
 *
 * @author Благодатских С.
 */
public interface AccountDao {

	void insert(Account account);

	void update(Account account);

	void update(List<Account> accounts);

	void delete(long accountId);

	Account find(long accountId);

	List<Account> find(List<Long> accountIds);

	List<Account> find(String ownerName);

	List<Account> find(boolean locked);

}
