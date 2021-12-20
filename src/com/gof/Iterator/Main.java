package com.gof.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("book name ab"));
        bookShelf.appendBook(new Book("book name cd"));
        bookShelf.appendBook(new Book("book name ef"));
        bookShelf.appendBook(new Book("book name gh"));

        Iterator it = bookShelf.Iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
