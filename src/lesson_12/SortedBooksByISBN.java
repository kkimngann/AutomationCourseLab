package lesson_12;

import java.util.Comparator;

public class SortedBooksByISBN implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getISBN().compareTo(o2.getISBN());
    }
}
