package com.wiley.beginningspring.ch6;

import com.wiley.beginningspring.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Благодатских С.
 */
public class Main {

	public static void main(String[] args) {
		/*
		 AccountService accountService = new AccountServiceJdbcTxImpl();
		 accountService.transferMoney(2L, 1L, 200.0d);
		 */
		/*
		 AnnotationConfigApplicationContext applicationContext
		 = new AnnotationConfigApplicationContext(Ch6Configuration.class);
		 AccountService accountService
		 = applicationContext.getBean(AccountService.class);
		 accountService.transferMoney(1L, 4L, 50.0d);
		 */
		AnnotationConfigApplicationContext applicationContext
				= new AnnotationConfigApplicationContext(Ch6Configuration.class);
		AccountService accountService
				= applicationContext.getBean("doaService", AccountService.class);
		accountService.transferMoney(1L, 2L, 160.0d);

	}
}
