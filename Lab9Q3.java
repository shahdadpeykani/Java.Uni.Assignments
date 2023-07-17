import java.util.Scanner;
import java.util.Arrays;
public class Lab9Q3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int [] a = new int [5];
        int [] b = new int [5];
        int [] c = new int [10];
        System.out.println("Enter first array in ascending order: ");
        for(int i=0;i<a.length;i++){
            a[i]=input.nextInt();
        }
        System.out.println("Enter second array in ascending order: ");
        for(int i=0;i<a.length;i++){
            b[i]=input.nextInt();
        }
        //MergeList
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[i+5]=b[i];
        }
        Arrays.sort(c);
        for(int element: c){
            System.out.print(element+" ");
        }
    }
}
