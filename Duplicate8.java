public class Duplicate8 {

    public static void duplicate(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        System.out.println(ans);
        for(int i=0;i<arr.length;i++){
            ans=ans^i;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr={5,1,2,3,4,2};
        duplicate(arr);
    
        
    }
    
}
