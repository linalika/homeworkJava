package lesson7;

public class StringApp {
    public static void main(String[] args) {
        String string = "Java";
        String string2 = new String("Java");
        String string3 = new String(new char[]{'j','a','v','a'});
        String string4 = "Java";
        System.out.println(string == string4);
        System.out.println(string == string2);
     }
}
