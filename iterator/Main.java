package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));

        Iterator<Book> it = bookShelf.iterator();
        // このWhileループはBookeShelfIteratorの実装のみを利用しているので、配列の実装を知らなくても使える
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println("Done.");
    }
}
