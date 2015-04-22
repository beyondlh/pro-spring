package com.wiley.beginningspring.ch6;

import com.wiley.beginningspring.service.AccountService;
import com.wiley.beginningspring.service.AccountServiceImpl;
import com.wiley.beginningspring.service.AccountServiceJdbcTxImplWithSpring;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.TransactionTemplate;

/**
 *
 * @author Благодатских С.
 */
@Configuration
//@EnableTransactionManagement
@Import(Ch4Configuration.class)
public class Ch6Configuration {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		DataSourceTransactionManager transactionManager
				= new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource());
		return transactionManager;
	}

	@Bean
	public AccountService accountService() {
		AccountServiceJdbcTxImplWithSpring bean
				= new AccountServiceJdbcTxImplWithSpring();
		bean.setDataSource(dataSource());
		return bean;
	}

	@Bean(name = "doaService")
	@Autowired
	public AccountService accountService(AccountDao accountDao) {
		AccountServiceImpl bean = new AccountServiceImpl();
		bean.setAccountDao(accountDao);
		bean.setTransactionTemplate(transactionTemplate());
		return bean;
	}

	@Bean
	public TransactionTemplate transactionTemplate() {
		TransactionTemplate transactionTemplate = new TransactionTemplate();
		transactionTemplate.setTransactionManager(transactionManager());
		return transactionTemplate;
	}

}
