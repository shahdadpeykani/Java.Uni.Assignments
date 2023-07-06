import java.util.Scanner;
public class Lab4Q3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        /*Write a Java program that inputs type of a ticket (front rows, middle rows and back rows) and the quantities of
        the ticket, calculate the total charge based on the rates shown below:
        • Front rows 600 TL per ticket
        • Middle rows 400 TL per ticket
        • Back rows 150 TL per ticket
        You need to input ticket type and quantities, and calculate total money to be paid.*/

        int total;
        System.out.println("Please enter the ticket type: ");
        String type = input.next();

        if(type.equalsIgnoreCase("front")||type.equalsIgnoreCase("middle")||type.equalsIgnoreCase("back")){
            System.out.println("How many "+type+" row tickets do you want? ");
            int numb = input.nextInt();

            if(type.equalsIgnoreCase("front")){
                total = numb*600;
            }else if(type.equalsIgnoreCase("middle")){
                total = numb*400;
            }else{
                total = numb*150;
            }
            System.out.println("Total cost is "+total+" TL.");
        }else{
            System.out.println("Invalid ticket type!");
        }
    }
}
