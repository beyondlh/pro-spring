package my.home.pro.test;

import my.home.springbeginning.ch11.ApplicationConfig;
import net.minidev.json.JSONArray;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = ApplicationConfig.class)
public class UserRestControllerTest {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	/*
	 @Test
	 public void testSave() {
	 //		"/users", method = RequestMethod.POST)
	 }
	 */

	@Test
	public void testList() throws Exception {
		mockMvc.perform(get("/rest/users"))
				.andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"))
				.andExpect(jsonPath("$").exists())
				.andExpect(jsonPath("$", new SizeMatcher(2)))
				.andExpect(jsonPath("$[0].id").value(1))
				.andExpect(jsonPath("$[1].id").value(2))
				.andExpect(jsonPath("$[0].name").value("Mert Caliskan"))
				.andExpect(jsonPath("$[1].name").value("Kenan Sevindik"));
	}
	/*
	 //	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	 @Test
	 public void testGet() {
	 }

	 //	@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
	 @Test
	 public void testUpdate() {
	 }

	 //	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	 @Test
	 public void testDelete() {
	 }
	 */
}

class SizeMatcher extends BaseMatcher<Object> {

	private final int count;

	public SizeMatcher(int count) {
		this.count = count;
	}

	@Override
	public boolean matches(Object obj) {
		return obj instanceof JSONArray && ((JSONArray) obj).size() == count;
	}

	@Override
	public void describeTo(Description d) {
	}
}
