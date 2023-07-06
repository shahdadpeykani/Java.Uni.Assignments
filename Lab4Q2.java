import java.util.Scanner;
public class Lab4Q2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        /* Write a java program to check if a number is divisible by other. A x is divisible by y, if there is no remainder
           left in the division operation*/

        System.out.println("Input numbers: ");
        int x = input.nextInt();
        int y = input.nextInt();

        if(x%y==0){
            System.out.println(x+" is divisible by "+y);
        }else{
            System.out.println(x+" is not divisible by "+y);
        }

    }
}
