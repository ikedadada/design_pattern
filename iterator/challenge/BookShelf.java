package iterator.challenge;

import java.util.ArrayList;
import java.util.Iterator;

// ConcreteAggregate
// 変更をこのクラスだけに集中させる
public class BookShelf implements Iterable<Book> {
    private ArrayList<Book> books;

    public BookShelf(int maxsize) {
        this.books = new ArrayList<>(maxsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return this.books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

}
