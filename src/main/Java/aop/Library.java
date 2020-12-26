package aop;

import java.util.List;

public interface Library {
    Book addBook(Person person,Book book);
    void returnBook();
    void takeBook();

}
