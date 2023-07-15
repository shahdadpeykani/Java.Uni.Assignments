import java.util.Scanner;
public class Lab9Q1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Size of the vectors: ");
        int size = input.nextInt();
        if(size!=0){
                int[] x = new int[size];
                int[] y = new int[size];
                int [] result = new int [size];
                System.out.println("First vector (x) ");
                for (int i = 0; i < size; i++) {
                    x[i] = input.nextInt();
                }
                System.out.println("First vector (y) ");
                for (int i = 0; i < size; i++) {
                    y[i] = input.nextInt();
                }
                for(int i =0;i<size;i++){
                    int f = 2*x[i]+3*y[i];
                    result[i]=f;
                }
            System.out.print("Result: ");
                for(int element: result){
                    System.out.print(element+" ");
                }
            }else{
                System.out.println("Bye!");
            }
        }
    }

