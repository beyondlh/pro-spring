package com.wiley.beginningspring.ch6;

import org.springframework.dao.DataAccessException;

/**
 *
 * @author Благодатских С.
 */
public class DeleteFailedException extends DataAccessException {

	public DeleteFailedException(String msg) {
		super(msg);
	}
}
