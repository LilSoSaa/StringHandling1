import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        String string1= "Hello";
        String string2= "How are you?";


    char[] charArray= {string1.charAt(0), string2.charAt(6), string2.charAt(string2.length()-2), string2.charAt(string2.length()-1)
    };
        System.out.println(Arrays.toString(charArray));
    }
}