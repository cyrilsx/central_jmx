package ch.collen.jmx.resources;

import ch.collen.jmx.Application;
import ch.collen.jmx.repo.InMemoryApplicationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import sun.security.acl.PrincipalImpl;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * Created by cyril on 02/07/17.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ApplicationController.class)
@AutoConfigureMockMvc
@ContextConfiguration(classes = {ApplicationController.class})
//@SpringBootTest
public class ApplicationControllerTest {

    @Autowired
    private MockMvc mvc;


    @MockBean
    private InMemoryApplicationRepository inMemoryApplicationRepository;

    @Test
    public void list() throws Exception {
        mvc.perform(get("/application")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json("{}"));
    }

    @Test
    public void createUpdateApplication() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

}
