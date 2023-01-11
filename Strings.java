import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // declaration of string
        // String name="Gnyan";
        // String fullName="Gnyan Ranjan Behera";
        // take input from the users
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your name");
        // String daata=sc.nextLine();
        // System.out.println("Yours name is "+daata);

        // string concatination
        String firstName="Tony";
        String lastName="Stack";

        String fullNames=firstName+lastName;
        System.err.println(fullNames);
        System.out.println("get the length of the string "+fullNames.length());

        // charAt
        for(int i=0;i<fullNames.length();i++){
            System.out.print(fullNames.charAt(i)+" ");
        }

        // compare two string
        String a="banti";
        String b="banti";
        // s1=s2:return 0
        // s1>s2:return +ve value
        // s1<s2:return -ve value

        if(a.compareTo(b)==0){
            System.out.println("string is equale");
        }else{
            System.out.println("string ar not equal");
        }
    }
}
