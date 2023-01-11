import java.util.ArrayList;

public class Triplets12 {
    public static void triplets(int[] arr,int sum){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==sum){
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                    }
                }
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int sum=12;
        triplets(arr, sum);
        
    }
}
