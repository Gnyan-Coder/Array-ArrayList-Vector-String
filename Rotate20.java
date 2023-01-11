import java.util.Vector;

public class Rotate20 {
    public static int[] rotate(int[] arr,int k){
        int[] arr3=new int[10];
        for(int i=0;i<arr.length;i++){
            arr3[(i+k)%arr.length]=arr[i];
        }
        return arr3;

    }
    public static void main(String[] args) {
        int arr[]={1,7,9,11};
        int k=2;
        int[] arr1=rotate(arr, k);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        
    }
}
