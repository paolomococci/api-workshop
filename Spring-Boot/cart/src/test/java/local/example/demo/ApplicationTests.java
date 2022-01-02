package local.example.demo;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ApplicationTests {

	private static final String CARTS_PATH = "/api/v1/carts/";

	@Autowired
	private MockMvc mockMvc;

	@Test
	void readTest()
			throws Exception {
		// TODO
	}

	@Test
	void readAllTest()
			throws Exception {
		// TODO
	}
}
