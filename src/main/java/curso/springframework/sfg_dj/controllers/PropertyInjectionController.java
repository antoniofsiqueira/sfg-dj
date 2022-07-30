package curso.springframework.sfg_dj.controllers;

import curso.springframework.sfg_dj.services.GreetingService;

public class PropertyInjectionController {

    public GreetingService greetingService;

    public String getGreeting(){
      return greetingService.sayGreeting();
    }
}
