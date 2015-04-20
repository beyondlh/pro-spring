package com.wiley.beginningspring.ch6;

import org.springframework.dao.DataAccessException;

/**
 *
 * @author Благодатских С.
 */
public class InsertFailedException extends DataAccessException {

	public InsertFailedException(String msg) {
		super(msg);
	}

}
