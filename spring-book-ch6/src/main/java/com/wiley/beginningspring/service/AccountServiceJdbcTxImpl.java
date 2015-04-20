package com.wiley.beginningspring.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Благодатских С.
 */
public class AccountServiceJdbcTxImpl implements AccountService {

	@Override
	public void transferMoney(long sourceAccountId, long targetAccountId,
			double amount) {
		Connection connection = null;
		try {
			DriverManager.registerDriver(new org.h2.Driver());
			connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
			connection.setAutoCommit(false);
			Statement statement = connection.createStatement();
			statement.executeUpdate("update account set balance = balance - "
					+ amount + " where id = " + sourceAccountId);
			statement.executeUpdate("update account set balance = balance + "
					+ amount + " where id = " + targetAccountId);
			connection.commit();
		} catch (SQLException e) {
			try {
				if (connection != null) {
					connection.rollback();
				}
			} catch (SQLException ex) {
			}
			throw new RuntimeException(e);
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
			}
		}

	}

}
