public class MoveZero19 {
    public static int[] moveZero(int[] arr){
        int nonZero=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                int temp=arr[j];
                arr[j]=arr[nonZero];
                arr[nonZero]=temp;
                nonZero++;
            }

        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        int arr2[]=moveZero(arr);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        
    }
}
