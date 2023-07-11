import java.util.Scanner;
public class Lab7Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*This program represents the average of a class and number of failed students,
         if we enter a number out of the range it asks for rewriting it
         */
        System.out.println("Enter the class size: ");
        int size = input.nextInt();
        double avg =0.0;
        double totalSum= 0.0;
        int failedStudent= 0;
       for(int i=1; i<=size;i++){
           System.out.println("Enter a grade between 0 and 100 for student "+i+": ");
           double grade = input.nextDouble();
           if(grade>100||grade<0){
               System.out.println("The grade is out of range, please try again: ");
               grade = input.nextDouble();
           }
           if(grade<55){
               failedStudent++;
           }
           totalSum+=grade;
           avg = totalSum/size;
       }
        System.out.println("The average is: "+avg);
        System.out.println("The number of failed students is: "+failedStudent);

    }
}