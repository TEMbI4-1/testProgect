package aop;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private String name;
    private String author;
    private int dateOfPublication;

    public Book(String name, String author, int dateOfPublication) {
        this.name = name;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }
    public Book(){

    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getDateOfPublication() {
        return dateOfPublication;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDateOfPublication(int dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }
}
