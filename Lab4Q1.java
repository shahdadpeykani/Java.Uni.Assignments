import java.util.Scanner;
public class Lab4Q1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        /*  Write a java program to decide larger of two input numbers. It takes two numbers as input, and prints the
            larger one.*/
        System.out.println("Enter two numbers: ");
        int numb1 = input.nextInt();
        int numb2 = input.nextInt();

        // we can use either if-else statement to find the max or the method of math class
        System.out.println(Math.max(numb2,numb1));

    }
}
