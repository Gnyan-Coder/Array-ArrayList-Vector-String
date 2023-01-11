public class Uniqueele6 {

    public static int unique(int[] arr){
        int n=0;
        for(int i=0;i<arr.length;i++){
            n=n^arr[i];
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr={3,7,2,2,7,3,4};
        int ele=unique(arr);
        System.out.println("Unique element :"+ele);
        
    }
}
