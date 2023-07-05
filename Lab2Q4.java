import java.util.Scanner;
public class Lab2Q4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
/*
Write a Java program that takes exactly a 4-digit number and prints the number of thousands, hundreds, tens
and units.
*/
        //Creating an array for saving each digit
        int [] arr = new int [4];

        System.out.println("Enter a 4 digits number: ");
        int numb = input.nextInt();

        // I used a loop in order to take each digit and save it in the array

for(int i=0; numb>i;i++){
    int digit = numb%10;
    arr[i]=digit;
    numb = numb /10;
}

        System.out.println("Thousands: "+arr[3]);
        System.out.println("Hundreds: "+arr[2]);
        System.out.println("Tens: "+arr[1]);
        System.out.println("Units: "+arr[0]);

    }
}
