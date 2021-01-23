package sda.finalproject.jgroup10.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/api/secure")
public class SecureController {

    @GetMapping("/two")
    public String secureOne(){
        return "TWO;";
    }


    @GetMapping("/one")
    public String secureTwo(){
        return "ONE";
    }

}
