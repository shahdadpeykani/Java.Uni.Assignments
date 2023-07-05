import java.util.Scanner;
public class Lab3Q1 {
    public static void main(String[]args){
        // This lab is for learning the methods of String class

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String text = input.nextLine();

        System.out.println("Last two characters in your entry is: "+text.substring(text.length()-2));

        System.out.println("Your entry has: "+text.length()+" characters");

        System.out.println("The UPPERCASE value of the string you entered is: "+text.toUpperCase());

        System.out.println("The lowercase value of the string you entered is: "+text.toLowerCase());

        System.out.println("Are they equal? "+text.equalsIgnoreCase(text.toUpperCase()));

        System.out.println("Index of character 'a' in your entry is: "+text.indexOf('a'));

        text = text.concat("-cmpe113-");
        System.out.println("The strings are concatenated: "+text);

        System.out.println("It's length becomes: "+text.length());

        int indexOfSpace = text.indexOf(" ");

        System.out.println(text.substring(indexOfSpace-1,indexOfSpace+2));


    }
}
