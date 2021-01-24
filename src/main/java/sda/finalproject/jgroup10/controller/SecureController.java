package sda.finalproject.jgroup10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sda.finalproject.jgroup10.controller.interceptor.IPAddressInterceptor;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/rest/api/secure")
public class SecureController {


    @GetMapping("/two")
    public String secureOne(HttpServletRequest request){
        System.out.println("REMOTE ADDRE: "  + request.getRemoteAddr());
        return "TWO;";
    }


    @GetMapping("/one")
    public String secureTwo(){
        return "ONE";
    }

}
