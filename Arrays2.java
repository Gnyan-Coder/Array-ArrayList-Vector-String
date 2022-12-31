import java.util.Scanner;

public class Arrays2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the rows:");
        int rows=sc.nextInt();
        System.out.print("Enter the columns:");
        int col=sc.nextInt();
        int[][] numbers=new int[rows][col];
        // take input of the 2d arrays
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        // display arrays elenment in 2d
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
