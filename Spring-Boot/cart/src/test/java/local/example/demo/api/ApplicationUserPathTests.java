package local.example.demo.api;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationUserPathTests {

    @Autowired
    private MockMvc mockMvc;

    private static final String API_V1_BASE_PATH = "/api/v1/users/";

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
