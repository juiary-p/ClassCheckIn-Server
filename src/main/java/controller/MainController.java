package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value = "/")
    public String test(){
        return "index";
    }

    @RequestMapping(value = "/test")
    public String test1(){
        return "index";
    }
}
