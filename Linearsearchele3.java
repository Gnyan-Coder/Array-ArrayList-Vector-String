public class Linearsearchele3 {
    public static boolean getElement(int[] arr,int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int ele=5;
        System.out.println(getElement(arr, ele));
        
    }
}
