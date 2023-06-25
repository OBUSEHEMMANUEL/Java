package arrayPractise;
//6/20/2023
public class Palindrome {
    public static void main(String[] args) {
        String word = "madam";
        System.out.println(palindrome(word));
    }
    public static String palindrome(String word) {
        String value = "";

        for (int i = word.length()-1; i >=0; i--) {
            value += word.charAt(i);
        }
        if (value.equalsIgnoreCase(word)) {
            return value;
        } else {
            return "Word not palindrome";
        }
    }
}
