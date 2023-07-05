import java.util.Scanner;
public class Lab2Q3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        /*  • Reads number of 1TL, 5TL, 10TL and 20TL.
            • Computes and prints total amount money.
            • Displays the total amount of money in terms of number of 20TLs and the remaining number of 1TLs
        */

        System.out.println("Number of 1TL: ");
        int TL1 = input.nextInt();

        System.out.println("Number of 5TL: ");
        int TL5 = input.nextInt();

        System.out.println("Number of 10TL: ");
        int TL10 = input.nextInt();

        System.out.println("Number of 20TL: ");
        int TL20 = input.nextInt();


        int total = TL20*20+TL10*10+TL5*5+TL1;
        System.out.println("Total money: "+total);

        int numberOf10 = total / 20;
        int numberOf1 = total % 10;
        System.out.println("Total money has "+numberOf10+"x20TLs and "+numberOf1+"x1TLs");
    }
}
