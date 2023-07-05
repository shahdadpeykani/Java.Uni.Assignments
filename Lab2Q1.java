import java.util.Scanner;
public class Lab2Q1 {
    public static void main(String[]args){
// Converting mile into kilometer using scanner, 1 mile = 1.609344 kilometers

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter distance in miles: ");
        double miles = input.nextDouble();
//rounding a number up
        double km = Math.round(miles*1.609344);
        System.out.println(miles+" miles is equal to "+km+" kilometers.");




    }
}
