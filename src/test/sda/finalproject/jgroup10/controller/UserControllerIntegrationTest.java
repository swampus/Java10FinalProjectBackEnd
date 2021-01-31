package sda.finalproject.jgroup10.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ContentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import sda.finalproject.jgroup10.dto.UserDTO;
import sda.finalproject.jgroup10.model.User;
import sda.finalproject.jgroup10.repository.UserRepository;
import sda.finalproject.jgroup10.service.UserService;

import javax.jws.Oneway;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@TestPropertySource(
        locations = "classpath:application-test.properties")
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void getUserById() throws Exception {

        mvc.perform(get("/rest/api/User.svc/user(1)"))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"status\":\"ACTIVE\",\"create_date\":\"24.01.2021\",\"id\":1," +
                        "\"name\":\"TEST_DMITRIJS\",\"code\":\"1234\",\"address\":\"asdasdsa dassada asdasd\"," +
                        "\"phone\":\"232232323\",\"email\":\"D@D.com\",\"notes\":\"nnasdasasd\"}"));
    }

    @Test
    public void saveUser() throws Exception {
        UserDTO userDTO = new UserDTO();
        userDTO.setName("D1");
        userDTO.setPhone("asdasasdas");
        userDTO.setEmail("abc@abc.com");
        userDTO.setAddress("asdasdsadasd");
        userDTO.setCreateDate(new Date());
        userDTO.setNotes("asdasdasdsad");

        mvc.perform(put("/rest/api/User.svc/user")
                .contentType(MediaType.APPLICATION_JSON).content(new ObjectMapper().writeValueAsString(userDTO)))
                .andExpect(status().isOk());

        assertFalse(userRepository.findByName("D1").isEmpty());
    }
}