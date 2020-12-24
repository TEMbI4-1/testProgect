package bean_tests;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Wow-wow");
    }
}
