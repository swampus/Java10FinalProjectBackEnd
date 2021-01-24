package sda.finalproject.jgroup10.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(SecureController.class)
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application-test.properties")
public class SecureControllerIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void secureOne() throws Exception {
        mvc.perform(get("/rest/api/secure/one"))
                .andExpect(status().isOk())
                .andExpect(content().string("ONE"));
    }

    @Test
    public void secureTwo() throws Exception {
        mvc.perform(get("/rest/api/secure/two"))
                .andExpect(status().isOk())
                .andExpect(content().string("TWO;"));
    }
}