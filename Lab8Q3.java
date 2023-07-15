import java.util.Scanner;
public class Lab8Q3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int counter =0;
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Number’s factors are: ");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
                counter++;
            }
        }
        if(counter==2){
            System.out.println("\nIt’s a prime number.");
        }
    }
}
