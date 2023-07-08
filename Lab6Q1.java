import java.util.Scanner;
public class Lab6Q1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = input.next();
        int size = name.length();
// In this question we take the length of a name and comment on it based on its length bt switch-case statement
        switch(size){

            case 0:
            case 1:
            case 2:
                System.out.println("This is not a real name.");
                break;
            case 3:
            case 4:
                System.out.println("You have a short name.");
                break;
                case 5:
                case 6:
                    System.out.println("A name with an average length.");
                    break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("What a name!");
                break;
            default :
                System.out.println("Is this only one name?");
        }

    }
}
