public class Reverse4 {

    public static int[] reverse(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,4,2,5,6};
        int[] arr1=reverse(arr);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }


        
    }
}
