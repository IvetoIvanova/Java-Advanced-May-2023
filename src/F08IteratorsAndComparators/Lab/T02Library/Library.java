package T02Library;

import java.util.Iterator;

public class Library<Book> implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibraryIterator();
    }

    private final class LibraryIterator implements Iterator<Book> {
        private int counter = 0;


        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Book next() {
            return null;
        }
    }
}
