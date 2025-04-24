/*
Reverse a String in Java (Using Recursion)

Post Title:
"Mastering Recursion: Reverse a String in Java! 🔄"

Content:
Ever thought about how to reverse a string using recursion? Here's a simple solution in Java.
 */
public class reverse{
    public static String reverse(String str){
        if(str.isEmpty()){
            return str;
        }
        return 
reverse(str.substring(1))+str.charAt(0);
    }
    public static void main(String args[]){
        String original="linkedin";
        String reversed = reverse(original);
        System.out.println(original);
        System.out.println(reversed);

    }
}