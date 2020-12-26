package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SchoolLibrary implements Library {

   // List<Book> bookList;




    @Override
    public Book addBook(Person person, Book book) {
        System.out.println(person.getLastName()+" "+person.getFirstName()+ " add book from SchoolLibrary - "
        +book.getName()+" "+ book.getAuthor());
        return book;
    }

    @Override
    public void returnBook() {
        System.out.println("Return book from SchoolLibrary");

    }

    @Override
    public void takeBook() {
        System.out.println("Take book from SchoolLibrary");

    }
}
