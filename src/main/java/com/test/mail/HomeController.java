package com.test.mail;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
   @RequestMapping("/test")
    public static String  test(){

        return "hello";
    }

}
