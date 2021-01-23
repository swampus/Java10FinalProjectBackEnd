package sda.finalproject.jgroup10.controller;

import org.apache.commons.lang3.builder.RecursiveToStringStyle;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sda.finalproject.jgroup10.dto.UserDTO;

import java.util.Date;

//FACTORY METHOD
@RestController
public class TestLogController {


    @Value("${jgroup10.environment}")
    private String environment;

    private final Logger LOGGER
            = LoggerFactory.getLogger(TestLogController.class.getName());

    @GetMapping("/testlog")
    public String testLog() {
        LOGGER.info("ENVIRONMENT: " + environment);
        LOGGER.debug("I AM DEBUG: " );
        LOGGER.info("INFO");
        LOGGER.warn("WARN");
        LOGGER.error("ERROR");


        UserDTO userDTO = new UserDTO();
        userDTO.setCode("CODE");
        userDTO.setName("Dmitrijs");
        userDTO.setCreateDate(new Date());
        userDTO.setAddress("my address somewhere");
        userDTO.setEmail("abc@bc.com");
        userDTO.setStatus("ACTIVE");
        userDTO.setPhone("232232323");

        LOGGER.debug("User in session: " +
                ReflectionToStringBuilder.reflectionToString(
                        userDTO, ToStringStyle.MULTI_LINE_STYLE));
        return environment;
    }

}
