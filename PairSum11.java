import java.util.ArrayList;
public class PairSum11 {
    public static void pair(int[] arr,int sum){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    list.add(Math.min(arr[i], arr[j]));
                    list.add(Math.max(arr[i], arr[j]));
                }
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,4,5};
        int sum=5;
        pair(arr, sum);

        
    }
}
