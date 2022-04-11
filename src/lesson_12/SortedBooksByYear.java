package lesson_12;

import java.util.Comparator;

public class SortedBooksByYear implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getYear() - o2.getYear();
    }
}
