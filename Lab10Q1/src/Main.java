import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Complex obj = new Complex();
        System.out.println("Enter a complex number: ");
        double x =input.nextDouble();
        double y = input.nextDouble();
        obj.ini(x,y);
        System.out.print("The complex number is: ");
        obj.print();
    }
}