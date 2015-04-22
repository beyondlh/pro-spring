package com.wiley.beginningspring.service;

import com.wiley.beginningspring.ch6.Account;
import com.wiley.beginningspring.ch6.AccountDao;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 *
 * @author Благодатских С.
 */
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	private TransactionTemplate transactionTemplate;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	@Override
//	@Transactional
	public void transferMoney(long sourceAccountId, long targetAccountId,
			double amount) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				Account sourceAccount = accountDao.find(sourceAccountId);
				Account targetAccount = accountDao.find(targetAccountId);
				sourceAccount.setBalance(sourceAccount.getBalance() - amount);
				targetAccount.setBalance(targetAccount.getBalance() + amount);
				accountDao.update(sourceAccount);
				accountDao.update(targetAccount);
			}
		});
		/*
		 Account sourceAccount = accountDao.find(sourceAccountId);
		 Account targetAccount = accountDao.find(targetAccountId);
		 sourceAccount.setBalance(sourceAccount.getBalance() - amount);
		 targetAccount.setBalance(targetAccount.getBalance() + amount);
		 accountDao.update(sourceAccount);
		 accountDao.update(targetAccount);
		 */
	}

}
