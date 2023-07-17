import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Box box = new Box();
        System.out.println("Enter box dimensions: ");
        int l = input.nextInt();
        int w = input.nextInt();
        int h = input.nextInt();
        box.ini(w,l,h);
        box.print();
    }
}