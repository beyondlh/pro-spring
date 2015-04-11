package my.home.pro.spring.ch4;

import java.sql.SQLException;
import java.sql.Types;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

/**
 *
 * @author Благодатских С.
 */
public class Main {

	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext applicationContext
				= new AnnotationConfigApplicationContext(Ch4Configuration.class);
//				= new AnnotationConfigApplicationContext(Ch4ConfigurationForPooledDS2.class);
		AccountDao accountDao = applicationContext.getBean(AccountDao.class);

		for (int i = 1; i < 5; ++i) {
			System.out.println(accountDao.find(i));
		}
		System.out.println("+++++++++++++++++++++++++++++++++");
		for (Account account : accountDao.find("GO")) {
			System.out.println(account);
		}
		System.out.println("+++++++++++++++++++++++++++++++++");
		for (Account account : accountDao.find("angel")) {
			System.out.println(account);
		}
		System.out.println("+++++++++++++++++++++++++++++++++");
		accountDao.find(Arrays.asList(2l, 4l, 1l)).stream().forEach(it -> {
			System.out.println(it);
		});
		System.out.println("Locked==========================");
		accountDao.find(true).stream().forEach(it -> {
			System.out.println(it);
		});

		System.out.println("UnLocked==========================");
		accountDao.find(false).stream().forEach(it -> {
			System.out.println(it);
		});

		Account account = new Account();
		account.setOwnerName("Joe Smith");
		account.setBalance(20.0);
		account.setAccessTime(new Date());
		account.setLocked(false);
		accountDao.insert(account);

		account = accountDao.find(account.getId());
		System.out.println("New account: " + account);

		account.setBalance(30.0);
		accountDao.update(account);
		account = accountDao.find(account.getId());

		System.out.println("Update account:  " + account);

		accountDao.delete(account.getId());

		List<Account> accounts = accountDao.find(Arrays.asList(account.getId()));
		System.out.println(accounts.size());

		JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate);
		simpleJdbcCall.withProcedureName("concat")
				.withoutProcedureColumnMetaDataAccess()
				.declareParameters(new SqlParameter("param1", Types.VARCHAR),
						new SqlParameter("param2", Types.VARCHAR))
				.returningResultSet("result", new SingleColumnRowMapper<>(String.class));
		simpleJdbcCall.compile();

		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("param1", "hello ");
		paramMap.put("param2", "world!");
		Map<String, Object> resultMap = simpleJdbcCall.execute(paramMap);
		resultMap.forEach((String s, Object o) -> {
			System.out.println(s);
			((List<String>)o).stream().forEach((it) -> {
				System.out.println("\t\t" + it);
			});
		});

	}
}
