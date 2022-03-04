package lesson_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab_4 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(9);
        myList.add(13);
        myList.add(20);
        myList.add(8);

        int minValue = myList.get(0);
        int maxValue = myList.get(0);
        for(int value: myList) {
            if (value < minValue) {
                minValue = value;
            }
            if (value > maxValue) {
                maxValue = value;
            }
        }

            System.out.println("List option:\n" +
                    "1. Add number to array list\n" +
                    "2.Print list numbers\n" +
                    "3. Find max number\n" +
                    "4. Find min number\n" +
                    "5. Find number\n" +
                    "0. Exit");

            Scanner scanner = new Scanner(System.in);
            boolean isContinue = true;
            while (isContinue) {
                System.out.println("\n=======================\nPlease select an option:");
                int mySelected = scanner.nextInt();
                switch (mySelected) {
                    case 0:
                        isContinue = false;
                        break;
                    case 1:
                        System.out.println("Please input your number:");
                        int myNumber = scanner.nextInt();
                        myList = addNumber(myList, myNumber);
                        break;
                    case 2:
                        System.out.println("This is your list:");
                        for (int i : myList) {
                            System.out.printf("%d,",i);
                        }
                        break;
                    case 3:
                        System.out.printf("Your max number is: %d\n", findMax(myList));
                        break;
                    case 4:
                        System.out.printf("Your min number is: %d\n", findMin(myList));
                        break;
                    case 5:
                        System.out.println("Please input your number:");
                        int findNumber = scanner.nextInt();
                        ArrayList<Integer> myListIndex  = findNumber(myList, findNumber);
                        if(myListIndex.size() == 0){
                            System.out.println("Do not existing your number in list");
                            break;
                        }
                        System.out.println("This is your list index:");
                        for (int i : myListIndex) {
                            System.out.printf("%d,",i);
                        }
                        break;
                    default:
                        System.out.println("Please input a value in menu");
                        break;
                }

            }
        }

    private static ArrayList<Integer> addNumber(ArrayList<Integer> myList, int myNumber) {
        myList.add(myNumber);
        return myList;
    }

    private static ArrayList<Integer> findNumber(ArrayList<Integer> myList, int myNumber) {
        ArrayList<Integer>  listIndex = new ArrayList<>();
        for(int i = 0 ; i< myList.size(); i++){
            if(myList.get(i) == myNumber){
                listIndex.add(i);
            }
        }
        return listIndex;
    }

    private static Integer findMin(ArrayList<Integer> myList) {
        int minValue = myList.get(0);
        for(int value: myList) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    private static Integer findMax(ArrayList<Integer> myList) {
        int maxValue = myList.get(0);
        for(int value: myList) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

}