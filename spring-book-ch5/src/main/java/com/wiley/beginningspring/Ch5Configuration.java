package com.wiley.beginningspring;

import com.wiley.beginningspring.dao.BookDao;
import com.wiley.beginningspring.dao.BookDaoJpaImpl;
import com.wiley.beginningspring.dao.BookService;
import com.wiley.beginningspring.dao.BookServiceImpl;
import com.wiley.beginningspring.dao.StudentDaoJpaImpl;
import com.wiley.beginningspring.entity.Book;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Благодатских С.
 */
@Configuration
@EnableTransactionManagement
public class Ch5Configuration {

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
	public LocalContainerEntityManagerFactoryBean emFactory() {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
		bean.setDataSource(dataSource());
		bean.setPackagesToScan(Book.class.getPackage().getName());
		bean.setJpaPropertyMap(jpaProperties());
		return bean;
	}

	@Bean
	public StudentDaoJpaImpl studentDao() {
		StudentDaoJpaImpl dao = new StudentDaoJpaImpl();
		return dao;
	}

	private Map<String, ?> jpaProperties() {
		Map<String, String> jpaPropertiesMap = new HashMap<>();
		jpaPropertiesMap.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		jpaPropertiesMap.put("hibernate.hbm2ddl.auto", "update");
		return jpaPropertiesMap;
	}

	@Bean
	@Autowired
	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}

	@Bean
	public BookDao bookDao() {
		BookDaoJpaImpl bean = new BookDaoJpaImpl();
		return bean;
	}

	@Bean
	public BookService bookService() {
		BookServiceImpl bean = new BookServiceImpl();
		bean.setBookDao(bookDao());
		return bean;
	}

}
