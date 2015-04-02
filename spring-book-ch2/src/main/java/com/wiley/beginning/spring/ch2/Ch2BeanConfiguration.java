package com.wiley.beginning.spring.ch2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Благодатских С.
 */
@ComponentScan
@Configuration
public class Ch2BeanConfiguration {
/*
	@Bean
	public AccountService accountService() {
		AccountServiceImpl bean = new AccountServiceImpl();
		bean.setAccountDao(accountDao());
		return bean;
	}

	@Bean
	public AccountDao accountDao() {
		return new AccountDaoInMemoryImpl();
	}
	*/
}
