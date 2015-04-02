package com.wiley.beginning.spring.ch2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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
		Account account3 = new Account();
		account3.setId(3L);
		account3.setOwnerName("Geanny");
		account3.setBalance(120.0);
		account3.setLocked(true);
		accountsMap.put(account1.getId(), account1);
		accountsMap.put(account2.getId(), account2);
		accountsMap.put(account3.getId(), account3);
	}

	@Override
	public void insert(Account account) {
		update(account);
	}

	@Override
	public void update(Account account) {
		accountsMap.put(account.getId(), account);
	}

	@Override
	public void update(List<Account> accounts) {
		accountsMap.putAll(
				accounts.stream()
				.collect(Collectors.toMap(Account::getId, (a) -> a)));
	}

	@Override
	public void delete(long accountId) {
		accountsMap.remove(accountId);
	}

	@Override
	public Account find(long accountId) {
		return accountsMap.get(accountId);
	}

	@Override
	public List<Account> find(List<Long> accountIds) {
		List<Account> found = new ArrayList<>();
		accountIds.stream().forEach(id -> {
			if (accountsMap.containsKey(id)) {
				found.add(accountsMap.get(id));
			}
		});
		return found;
	}

	@Override
	public List<Account> find(String ownerName) {
		List<Account> found = new ArrayList<>();
		accountsMap.values().stream().forEach(a -> {
			if (a.getOwnerName().equalsIgnoreCase(ownerName)) {
				found.add(a);
			}
		});
		return found;
	}

	@Override
	public List<Account> find(boolean locked) {
		List<Account> found = new ArrayList<>();
		accountsMap.values().stream().forEach(a -> {
			if (a.isLocked() == locked) {
				found.add(a);
			}
		});
		return found;
	}

}
