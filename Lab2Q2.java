import java.util.Scanner;
public class Lab2Q2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        // getting three integers from user
        System.out.println("Enter integer x: ");
        int x = input.nextInt();
        System.out.println("Enter integer y: ");
        int y = input.nextInt();
        System.out.println("Enter integer z: ");
        int z = input.nextInt();
        //making two functions
        int f = (x-y)/(x+y)+(3*x*y);
        double g = Math.round(((Math.pow(x,2)-Math.pow(y,2))/(x+z))+((Math.pow(x,2)+Math.pow(z,2))/(y-z)));
        // printing the result
        System.out.println("f("+x+","+y+")= "+f);
        System.out.println("g("+x+","+y+","+z+")= "+g);
    }
}
