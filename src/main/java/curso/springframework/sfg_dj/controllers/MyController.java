package curso.springframework.sfg_dj.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello Joe!!!");
        return "Vai Kurintia!!!";
    }
}
