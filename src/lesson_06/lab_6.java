package lesson_06;

import java.util.Scanner;

public class lab_6 {
    public static void main(String[] args) {
        //Lab 6.1 Given input string: "2hrs and 5 minutes" --> Please calculate how many minutes in total
        String myTime = "2hrs and 5 minutes";
        String[] myTimeArr = myTime.split("and");
        int hour = Integer.parseInt(myTimeArr[0].substring(0, myTimeArr[0].indexOf("hrs")).trim());
        int minute = Integer.parseInt(myTimeArr[1].substring(0, myTimeArr[1].indexOf("minutes")).trim());
        System.out.println("Total minutes is: " + (hour*60 + minute));

        //Lab 6.2:
        Scanner scannerInputPass = new Scanner(System.in);
        int incorrectTime = 0;
        String myPassword = "password123";
        String password;
        while (incorrectTime < 3){
            System.out.print("Please input your password: ");
            password = scannerInputPass.nextLine();
            if(password.equals(myPassword)){
                System.out.println("You input correct password");
                break;
            }
            else{
                incorrectTime++;
                System.out.println("Please input password again. Your have " + (3-incorrectTime) + " times remain");
            }
        }

        //Lab 6.3 do not use the regex and get number in string
        System.out.print("Please input your string: ");
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();
        for(char c : originalString.toCharArray()){
            if (!Character.isDigit(c)){
                originalString = originalString.replace(String.valueOf(c),"");
            }
        }
        System.out.println("The number string: " + originalString);

        //6.4 String url = "https://google.com" --> Check http OR https; domain name, .com OR .net
        String url = "https://google.com";
        System.out.println("The method: " + url.split(":")[0]);
        System.out.println("Domain: " + url.split("\\.")[url.split("\\.").length-1]);

    }
}
