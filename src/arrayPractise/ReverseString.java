package arrayPractise;
//6/20/2023
public class ReverseString {
    public static void main(String[] args) {
        String word = "Emmanuel";
        System.out.println(reverseString(word));
    }
    public static String reverseString(String word){
        String value ="";
        for (int i = word.length()-1; i >=0; i--) {
            value += word.charAt(i);
        }
        return value;
    }
}
