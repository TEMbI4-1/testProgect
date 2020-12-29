package com.artem.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstVieW(){
        return "FirstView";
    }
    @RequestMapping("/askDetail")
    public String askDetail(){
        return "askEmpDetailView";
    }
    @RequestMapping("/showDetail")
    public String showDetail(){
        return "showDetailView";
    }

}
