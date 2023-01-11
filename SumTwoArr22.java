import java.util.ArrayList;

public class SumTwoArr22 {
    public static ArrayList<Integer> sum(int[] arr1,int[] arr2){
        int i=arr1.length-1;
        int j=arr2.length-1;
        int carry=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i>=0 && j>=0){
            int val1=arr1[i];
            int val2=arr2[j];
            int sum=val1+val2+carry;
            carry=sum/10;
            sum=sum%10;
            ans.add(sum);
            i--;
            j--;
        }
        // first case
        while(i>=0){
            int sum=arr1[i]+carry;
            carry=sum/10;
            sum=sum%10;
            ans.add(sum);
            i--;
        }
        while(j>=0){
            int sum=arr2[j]+carry;
            carry=sum/10;
            sum=sum%10;
            ans.add(sum);
            j--;
        }
        while(carry!=0){
            int sum=carry;
            carry=sum/10;
            sum=sum%10;
            ans.add(sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={6};
        ArrayList<Integer> arr3=sum(arr1, arr2);
        for(int i=0;i<arr3.size();i++){ 
            System.out.print(arr3.get(i)+" ");
        }
    }
    
}
