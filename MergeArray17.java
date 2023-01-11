import java.util.ArrayList;

public class MergeArray17 {
    public static ArrayList<Integer> merge(int[] arr1,int[] arr2){
        ArrayList<Integer> arr3=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3.add(arr1[i]);
                i++;
            }else{
                arr3.add(arr2[j]);
                j++;
            }
        }
        while(i<arr1.length){
            arr3.add(arr1[i]);
            i++;

        }
        while(j<arr2.length){
            arr3.add(arr2[j]);
            j++;
        }
        return arr3;

        }
        
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6};
        ArrayList<Integer> arr3=merge(arr1, arr2);

        for(int i=0;i<arr3.size();i++){
            System.out.print(arr3.get(i)+" ");
        }

    }
}
