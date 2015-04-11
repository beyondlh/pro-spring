package com.wiley.beginning.spring.ch2;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Благодатских С.
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Ch2BeanConfiguration.class);
//		AccountService accountService = ctx.getBean("accountService", AccountService.class);
		AccountService accountService = ctx.getBean(AccountService.class);
		System.out.println("Before money transfer");
		System.out.println("Account 1 balance :" + accountService.getAccount(1)
				.getBalance());
		System.out.println("Account 2 balance :" + accountService.getAccount(2)
				.getBalance());
		accountService.transferMoney(1, 2, 5.0);
		System.out.println("After money transfer");
		System.out.println("Account 1 balance :" + accountService.getAccount(1)
				.getBalance());
		System.out.println("Account 2 balance :" + accountService.getAccount(2)
				.getBalance());

//		AccountDao dao = ctx.getBean("accountDao", AccountDao.class);
		AccountDao dao = ctx.getBean(AccountDao.class);

		System.out.println("Before update");
		dao.find(Arrays.asList(1l, 2l, 3l)).stream().forEach(a -> {
			System.out.println(a);
		});
		dao.update(Arrays.asList(new Account(4l, "Serge"), new Account(5l, "Angel"),
				new Account(6l, "Barbi")));

		System.out.println("After update");
		dao.find(Arrays.asList(1l, 2l, 3l, 4l, 5l, 6l)).stream().forEach(a -> {
			System.out.println(a);
		});

	}
}
