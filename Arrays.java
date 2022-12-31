import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arrays:");
        int size=sc.nextInt();
        int[] numbers=new int[size];
        
        // take user input in arryas
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        // display the array elements
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }

    }
}
