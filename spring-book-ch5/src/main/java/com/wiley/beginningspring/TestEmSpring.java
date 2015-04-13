package com.wiley.beginningspring;

import com.wiley.beginningspring.dao.BookService;
import com.wiley.beginningspring.entity.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Благодатских С.
 */
public class TestEmSpring {

	public static void main(String[] args) {
		ApplicationContext applicationContext
				= new AnnotationConfigApplicationContext(Ch5Configuration.class);
		/*
		 EntityManagerFactory entityManagerFactory
		 = applicationContext.getBean(EntityManagerFactory.class);

		 EntityManager entityManager = entityManagerFactory.createEntityManager();
		 EntityTransaction transaction = entityManager.getTransaction();
		 transaction.begin();
		 Student student = new Student();
		 student.setFirstName("John");
		 student.setLastName("Smith");
		 entityManager.persist(student);
		 transaction.commit();
		 entityManager.close();
		 entityManagerFactory.close();
		 */
		/*
		 StudentDaoJpaImpl dao = applicationContext.getBean(StudentDaoJpaImpl.class);
		 Student student = new Student();
		 student.setFirstName("Angel");
		 student.setLastName("OG");
		 dao.save(student);
		 */

		BookService bookService = applicationContext.getBean(BookService.class);
		Book book = new Book();
		book.setName("book1");
		bookService.save(book);

	}
}
