package Deitel.chapter_14.Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



import javax.print.attribute.standard.MediaSize;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Regex {
    public static void main(String[] args) {
        String mail = "f.oladeji@semicolon.africa";
        String name = "Obuseh";
        String lastName = "Emanuel";
        String password = "Victor78!";
        //System.out.println(mail(mail));
       // System.out.println(passwordValidation2(password));

    String address = "7th Avenue v close";
        System.out.println(validAddress(address));

    }
    public static boolean validateFirstName(String firstName){
        return firstName.matches("[A-Z][a-zA-Z]*");
    }
    public static boolean mail(String mail){
       // return mail.matches("[a-z].[a-z]+@semicolon.africa");
        Pattern p = Pattern.compile("[a-z].[a-z]+@semicolon.africa");
      Matcher matcher =  p.matcher(mail);
        return matcher.matches();
    }
public static boolean validateLastName(String lastName) {
        return lastName.matches("[a-zA-Z]+(['_-][a-zA-z]+)*");
}
public static boolean passwordValidation(String password){
        return password.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[a-zA-Z])+(?=.*[1-9)])+(?=.*[\\w]).+");
}
    public static boolean passwordValidation2(String password){
        return password.matches("[A-Z][a-zA-Z]+[1-9)]+\\W{1,5} |\\w{1,5}");
    }
    public static boolean validAddress(String address){
        return address.matches("\\d*[a-zA-z]*\\s+[a-zA-z]+\\s+[a-zA-z]+\\s+[a-z-A-Z]+") ;
    }
}
