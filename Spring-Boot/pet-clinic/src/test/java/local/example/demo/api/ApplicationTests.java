package local.example.demo.api;

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

	private static final String PATIENTS_PATH = "/patients/";

	@Autowired
	private MockMvc mockMvc;

	@Test
	void readAllTest() throws Exception {
		this.mockMvc.perform(get(PATIENTS_PATH)).andExpect(status().isNotImplemented());
	}
}
