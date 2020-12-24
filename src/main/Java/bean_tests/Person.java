package bean_tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {
    private Pet pet;
    @PostInit(i=2)
    private int i;

    public Pet getPet() {
        return pet;
    }
    @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("Common...my pet -"+ i);
        pet.say();
    }

    public void postInit(){
        System.out.println("PostInit method work");
    }
    @PostConstruct
    public void init(){
        System.out.println("init method work");
    }
}
