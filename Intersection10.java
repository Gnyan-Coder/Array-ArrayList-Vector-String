public class Intersection10 {
    public static void intersection(int[] arr1,int[] arr2){
        for(int i=0;i<arr1.length;i++){
            int element=arr1[i];
            for(int j=0;j<arr2.length;j++){
                if(element==arr2[j]){
                    System.out.print(element+" ");
                    arr2[j]=-3294924;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1={1,2,2,2,3,4};
        int[] arr2={2,2,3,3};
        intersection(arr1, arr2);
        
    }
}
