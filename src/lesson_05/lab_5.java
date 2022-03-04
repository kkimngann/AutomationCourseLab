package lesson_05;

import java.util.HashMap;
import java.util.Scanner;

public class lab_5 {
    public static void main(String[] args) {
        HashMap<Integer, String> myStudentList = new HashMap<>();
        System.out.println("List option:\n" +
                "1. Input student info\n" +
                "2. Find student by ID\n" +
                "0. Exit");

        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        int id;
        while (isContinue) {
            System.out.print("\n==========================================\nPlease select an option: ");
            int mySelected = scanner.nextInt();
            switch (mySelected){
                case 1:
                    do {
                        System.out.print("Please input your student ID: ");
                        id = scanner.nextInt();
                    }while(findStudentID(myStudentList, id));
                    scanner.nextLine(); // avoid not waiting for input name
                    System.out.print("Please input your student name: ");
                    String name = scanner.nextLine();
                    myStudentList.put(id, name);
                    break;
                case 2:
                    System.out.print("Please input student is you want to find: ");
                    id = scanner.nextInt();
                    if(findStudentID(myStudentList,id)){
                        System.out.printf("Your student name is: %s", myStudentList.get(id));

                    }else {
                        System.out.printf("Not found any student with id %d", id);
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

    private static boolean findStudentID(HashMap<Integer, String> myList, int id){
        return myList.containsKey(id);
    }
}
