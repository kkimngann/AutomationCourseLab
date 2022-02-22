package lesson_02;

import java.util.Scanner;

public class lab_2_2 {
    public static void main(String[] args) {
        System.out.print("Please input the number you want to check: ");
        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println("Inputted number is even number");
        }else{
            System.out.println("Inputted number is odd number");
        }
    }
}
