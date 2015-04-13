package com.wiley.beginningspring.dao;

import com.wiley.beginningspring.entity.Book;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Благодатских С.
 */
@Transactional
@Repository
public class BookServiceImpl implements BookService {

	private BookDao bookDao;

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public void save(Book book) {
		try {
			bookDao.save(book);
		} catch (DataAccessException ex) {

		}
	}

}
