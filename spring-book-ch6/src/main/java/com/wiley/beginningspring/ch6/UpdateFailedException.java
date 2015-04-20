package com.wiley.beginningspring.ch6;

import org.springframework.dao.DataAccessException;

/**
 *
 * @author Благодатских С.
 */
public class UpdateFailedException extends DataAccessException {

	public UpdateFailedException(String msg) {
		super(msg);
	}
}
