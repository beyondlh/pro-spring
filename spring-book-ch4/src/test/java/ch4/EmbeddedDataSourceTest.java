package ch4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/**
 *
 * @author Благодатских С.
 */
public class EmbeddedDataSourceTest {

	private DataSource dataSource;

	@Before
	public void setUp() {
		dataSource = new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2)
				.setName("testEmbeddedBase")
				.addScript("classpath:schema.sql")
				.addScript("classpath:data.sql").build();
	}

	@Test
	public void testDataAccessLogic() throws SQLException {
		try (Connection connection = dataSource.getConnection()) {
			Assert.assertFalse(connection.isClosed());
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM ACCOUNT");
			Assert.assertTrue(rs.next());
			showRow(rs);
			while (rs.next()) {
				showRow(rs);
			}
		}
	}

	@After
	public void tearDown() {
		((EmbeddedDatabase) dataSource).shutdown();
	}

	private void showRow(ResultSet rs) throws SQLException {
		System.out.println("id: " + rs.getLong("id")
				+ ", name: " + rs.getString("owner_name")
				+ ", balance: "
				+ rs.getDouble("balance") + ", access_time: "
				+ rs.getDate("access_time") + ", locked: "
				+ rs.getBoolean("locked")
		);
	}
}
