package aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary implements Library {
    @Override
    public Book addBook(Person person,Book book) {
        System.out.println("Add book from UniversityLibrary");
        return book;
    }

    @Override
    public void returnBook() {
        System.out.println("Return book from UniversityLibrary");

    }

    @Override
    public void takeBook() {
        System.out.println("Take book from UniversityLibrary");

    }
}
