package com.wiley.beginningspring.dao;

import com.wiley.beginningspring.entity.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author Благодатских С.
 */
public class StudentDaoJpaImpl {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	public void save(Student student) {
		EntityManager entityManager = entityManagerFactory
				.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(student);
		transaction.commit();
		entityManager.close();
	}

}
