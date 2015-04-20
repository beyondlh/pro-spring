package com.wiley.beginningspring.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Благодатских С.
 */
public class AccountServiceJdbcTxImplWithSpring implements AccountService {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	@Transactional
	public void transferMoney(long sourceAccountId, long targetAccountId, double amount) {
		Connection connection = DataSourceUtils.getConnection(dataSource);
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate("update account set balance = balance - "
					+ amount + " where id = " + sourceAccountId);
			statement.executeUpdate("update account set balance = balance + "
					+ amount + " where id = " + targetAccountId);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			DataSourceUtils.releaseConnection(connection, dataSource);
		}

	}

}
