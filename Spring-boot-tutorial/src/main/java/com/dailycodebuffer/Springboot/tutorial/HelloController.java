package com.dailycodebuffer.Springboot.tutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloworld() {

        return "welcome to Daily code BUffer!!aaaaaaaaa";
   }

}
