public class ReversePos16 {
    public static int[] reverse(int[] arr,int pos){
        int s=pos+1;
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
        int[] arr={10,9,8,7,6};
        int pos=2;
        int arr1[]=reverse(arr, pos);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        
    }
}
