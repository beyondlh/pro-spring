package com.wiley.beginningspring.dao;

import com.wiley.beginningspring.entity.Book;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Благодатских С.
 */
public class BookDaoJpaImpl implements BookDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void save(Book book) {
		entityManager.persist(book);
	}

}
