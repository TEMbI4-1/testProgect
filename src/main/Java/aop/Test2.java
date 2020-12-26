package aop;

import aop.servis.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Library schoolLibrary = context.getBean("schoolLibrary", Library.class);

        Person ivanov = new Person("Ivan","Ivanov",23,1);
        Book    warAndPeace = new Book("War and Peace","L. Tolstoy",1980);


        schoolLibrary.addBook(ivanov,warAndPeace);
        System.out.println(warAndPeace.getAuthor());



    }
}
