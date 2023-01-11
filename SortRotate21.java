public class SortRotate21 {
    public static boolean check(int arr[]){
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                count++;
            }
        }
        if(arr[arr.length-1]>arr[0]){
            count++;
        }
        return count<=1;
    }
    public static void main(String[] args) {

    int[] arr={1,2,3,4,5,6};
    System.out.println(check(arr));
        
    }
    
}
