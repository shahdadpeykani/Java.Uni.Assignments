import java.util.Scanner;
public class Lab5Q2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to days in a month calculator...");
        System.out.println("Enter a month:");
        String month = input.next();
// This question is the usage of switch-case statement for finding the day of each month.
        switch(month){
            case "Jan" :
                System.out.println("There are 31 days in Jan.");
                break;
            case "Mar" :
                System.out.println("There are 31 days in Mar.");
                break;
            case"May":
                System.out.println("There are 31 days in May.");
                break;
            case"July":
                System.out.println("There are 31 days in July.");
                break;
            case"Aug":
                System.out.println("There are 31 days in Aug.");
                break;
            case"Oct":
                System.out.println("There are 31 days in Oct.");
                break;
            case"Dec":
                System.out.println("There are 31 days in Dec.");
                break;
            case"Apr":
                System.out.println("There are 30 days in Apr.");
                break;
            case"Jun":
                System.out.println("There are 30 days in Jun.");
                break;
            case"Sep":
                System.out.println("There are 30 days in Sep.");
                break;
            case"Nov":
                System.out.println("There are 30 days in Nov.");
                break;
            case"Feb":
                System.out.println("There are 29 days in Feb if leap year, otherwise 28.");
                break;
            default :
                System.out.println("The month in invalid.");
        }
    }
}
