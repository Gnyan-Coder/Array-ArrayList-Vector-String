public class StringsBuilders {
    // string are immutable
   public static void main(String[] args) {
    // StringBuilder sb=new StringBuilder("Gnyan");
    // System.out.println(sb);


    // set character at perticular index
    // sb.setCharAt(0, 'B');
    // System.out.println(sb);


    // insert the character at index
    // sb.insert(0, 'c');
    // System.out.println(sb);

    // delete character
    // sb.delete(0, 1);
    // System.out.println(sb);

    // append charcter at the end of string
    // sb.append('R');
    // System.out.println(sb);

    // reverse of string
    // sb.reverse();
    // System.out.println(sb);

    StringBuilder str=new StringBuilder("Hello");

    for(int i=0;i<str.length();i++){
        int front=i;
        int back=str.length()-1-i;
        char frontChar=str.charAt(front);
        char backChar=str.charAt(back);
        str.setCharAt(front, backChar);
        str.setCharAt(back, frontChar);
        System.out.println(str);
    }
   


   }
}
