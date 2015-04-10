package my.home.pro.spring.ch4;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Благодатских С.
 */
@Configuration
public class Ch4ConfigurationForPooledDS2 {

	@Bean(destroyMethod = "close")
	public DataSource dataSource() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("org.h2.Driver");
		dataSource.setJdbcUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUser("sa");
		dataSource.setPassword("");
		return dataSource;
	}

}
