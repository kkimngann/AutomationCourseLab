package lesson_02;


import java.util.Scanner;

public class lab_2_1and2_3 {

    public static void main(String[] args) {
        float bmi = 0;
        float weightGap = 0;
        System.out.print("Please in your weight(kg): ");
        Scanner scanner = new Scanner(System.in);
        float weight = scanner.nextFloat();
        System.out.print("Please in your height(m): ");
        float height = scanner.nextFloat();
        if(height == 0){
            System.out.println("You inputted the invalid value");
            return;
        }
        bmi = weight / (height  * 2);
        if(bmi <=18.5){
            weightGap = 18.5f * (height * 2) - weight;
            System.out.printf("You are under weight and your need to increase %f(kg) to get normal weight\n",weightGap);
        } else if( bmi <=24.9){
            System.out.printf("You are normal weight and your bmi is %f\n",bmi);
        } else {
            weightGap = weight- 18.5f * (height * 2);
            if(bmi <=29.9){
                System.out.printf("You are over weight and your need to decrease %f (kg) to get normal weight\n",weightGap);
            }else {
                System.out.printf("You are obesity and your need to decrease %f(kg) to get normal weight\n", weightGap);
            }
        }
    }
}
