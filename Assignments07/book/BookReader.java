package com.solid.book;

import java.util.List;

public class BookReader extends Book implements IBookReader {
    public BookReader(String title, List<String> pages) {
        super(title, pages);
    }

    public void printToScreen() {
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }

    public static void main(String[] args) {
        IBookReader book = new BookReader("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}
