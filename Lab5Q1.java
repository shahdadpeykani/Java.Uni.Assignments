import java.util.Scanner;
public class Lab5Q1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Real Steel Calculator!");
        System.out.println("Enter the value of hardness: ");
        int hardness = input.nextInt();
        System.out.println("Enter the value of carbon content: ");
        double carbon = input.nextDouble();
        System.out.println("Enter the value of tensile strength: ");
        int strength = input.nextInt();

        if(hardness>50&&carbon<0.7&&strength>5600){
            System.out.println("This is grade 10 steel.");
        }else if(hardness>50&&carbon<0.7){
            System.out.println("This is grade 9 steel.");
        }else if(carbon<0.7&&strength>5600){
            System.out.println("This is grade 8 steel.");
        }else if(hardness>50&&strength>5600){
            System.out.println("This is grade 7 steel.");
        }else if(hardness>50||carbon<0.7||strength>5600){
            System.out.println("This is grade 6 steel.");
        }else{
            System.out.println("This is grade 5 steel.");
        }

    }
}
