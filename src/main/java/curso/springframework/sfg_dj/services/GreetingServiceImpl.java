package curso.springframework.sfg_dj.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hellow World!";
    }
}
