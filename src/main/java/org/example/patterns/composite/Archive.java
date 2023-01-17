package org.example.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Archive extends Book {

    private List<Book> books = new ArrayList<>();

    public Archive(String name) {
        super(name);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public void printName() {
        System.out.println(getName());
        books.forEach(Book::printName);
    }
}
