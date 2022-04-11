package lesson_12;


import java.util.*;

public class lab_12 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        System.out.println("List option:\n" +
                "1. Input book\n" +
                "2. Sort book by ISBN\n" +
                "3. Sort book by Title\n" +
                "4. Sort book by Year\n" +
                "0. Exit");

        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        int id;
        while (isContinue) {
            System.out.print("\n==========================================\nPlease select an option: ");
            int mySelected = scanner.nextInt();
            scanner.nextLine();
            switch (mySelected){
                case 1:
                    System.out.print("Please input ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Please input Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Please input author name: ");
                    String authorName = scanner.nextLine();
                    System.out.print("Please input year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    Book newBook = new Book(isbn, title, authorName, year);
                    bookList.add(newBook);
                    break;
                case 2:
                    Collections.sort(bookList, new SortedBooksByISBN());
                    System.out.println(bookList);
                    break;
                case 3:
                    Collections.sort(bookList, new SortedBooksByTitle());
                    System.out.println(bookList);
                    break;
                case 4:
                    Collections.sort(bookList, new SortedBooksByYear());
                    System.out.println(bookList);
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Please input a value in menu");
                    break;
            }
        }
    }
}
