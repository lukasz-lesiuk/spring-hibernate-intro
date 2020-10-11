package com.raczkowski;

import org.springframework.stereotype.Controller;


@Controller
public class TokenController {

//    @GetMapping("/", "/index")
    public String index() {
        return "index";
    }

}
