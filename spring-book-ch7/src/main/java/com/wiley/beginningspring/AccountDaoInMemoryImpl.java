package com.wiley.beginningspring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Благодатских С.
 */
@Repository
public class AccountDaoInMemoryImpl implements AccountDao {

	private final Map<Long, Account> accountsMap = new HashMap<>();

	{
		Account account1 = new Account();
		account1.setId(1L);
		account1.setOwnerName("John");
		account1.setBalance(10.0);
		Account account2 = new Account();
		account2.setId(2L);
		account2.setOwnerName("Mary");
		account2.setBalance(20.0);
		accountsMap.put(account1.getId(), account1);
		accountsMap.put(account2.getId(), account2);
	}

	@Override
	public void update(Account account) {
		accountsMap.put(account.getId(), account);
	}

	@Override
	public Account find(long accountId) {
		return accountsMap.get(accountId);
	}

	@Override
	public void insert(Account account) {
		Long id = account.getId();
		if (!accountsMap.containsKey(id)) {
			accountsMap.put(id, account);
		}
	}

	@Override
	public void update(List<Account> accounts) {
		for (Account a : accounts) {
			update(a);
		}
	}

	@Override
	public void delete(long accountId) {
		accountsMap.remove(accountId);
	}

	@Override
	public List<Account> find(List<Long> accountIds) {
		List<Account> found = new ArrayList<>();
		for (Long id : accountsMap.keySet()) {
			if (accountIds.contains(id)) {
				found.add(accountsMap.get(id));
			}
		}
		return found;
	}

	@Override
	public List<Account> find(String ownerName) {
		List<Account> found = new ArrayList<>();
		for (Account a : accountsMap.values()) {
			if (a.getOwnerName().equals(ownerName)) {
				found.add(a);
			}
		}
		return found;
	}

	@Override
	public List<Account> find(boolean locked) {
		List<Account> found = new ArrayList<>();
		for (Account a : accountsMap.values()) {
			if (a.isLocked() == locked) {
				found.add(a);
			}
		}
		return found;
	}

}
