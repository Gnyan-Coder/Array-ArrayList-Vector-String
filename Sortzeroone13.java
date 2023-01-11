public class Sortzeroone13 {
    public static int[] sort(int[] arr){
       int s=0;
       int e=arr.length-1;
       while(s<=e){
        if(arr[s]==0){
            s++;
        }
        if(arr[e]==1){
            e--;
        }
        if(arr[s]==1 && arr[e]==0){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
       }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={0,1,1,0,0,1};
        int arr1[]=sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr1[i]+" ");
        }

        
    }
}
