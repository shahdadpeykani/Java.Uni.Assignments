import java.util.Scanner;
public class Lab8Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int [10];
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". number: ");
            arr[i]=input.nextInt();
        }
        int min = arr[0];
        for(int element:arr){
            if(element<arr[0]){
                min =element;
            }
        }
        System.out.println("The smallest number is "+min);
    }
}