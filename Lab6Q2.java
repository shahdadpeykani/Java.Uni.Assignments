import java.util.Scanner;
public class Lab6Q2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
int numb = input.nextInt();

for(int i=1;i<=numb;i++){

    System.out.println("Square of "+i+": "+(int)(Math.pow(i,2)));
}
    }
}
