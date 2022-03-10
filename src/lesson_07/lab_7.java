package lesson_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab_7 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        System.out.println("List option:\n" +
                "1. Input book\n" +
                "2. Find book by ISBN\n" +
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
                    System.out.print("Please input ISBN you want to find: ");
                    String isbnToFoFind = scanner.nextLine();
                    List<Book> foundListBook  = findBookByISBN(isbnToFoFind, bookList);
                    if(foundListBook.size() == 0){
                        System.out.printf("Do not found any book wirth %s", isbnToFoFind);
                        break;
                    }
                    for(Book book: foundListBook){
                        System.out.println(book);
                    }
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

    private static List<Book> findBookByISBN(String ISBN, List<Book> bookList){
        List<Book> foundListBook = new ArrayList<>();
        for(Book book : bookList){
            if(book.getISBN().equalsIgnoreCase(ISBN)){
                foundListBook.add(book);
            }
        }
        return foundListBook;
    }
}
