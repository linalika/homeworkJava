package HomeWorkApp2;

public class homework2 {
    public static void main(String[] args) {
        checkSum(10,5);

        isPositive(1);
        isPositive(0);
        isPositive(-10);

        isNegative(-10);
        isNegative(10);



        writeString("Hello my friend",3);
        year(2020);

    }
    public static boolean checkSum(int number1, int number2) {
        if(10 < number1+number2 && number1+number2 <= 20 ){
            return true;
        }else {
            return false;
        }
    }

    public static void isPositive(int number) {
        if(number>=0) {
            System.out.println(number + " целое положительное число");
        }else {
            System.out.println(number + " целое отрицательное число");
        }

    }

    public static boolean isNegative(int number) {
        if(number>=0) {
            return false;
        }else {
            return true;
        }

    }

    public static void writeString(String my_str, int amount) {
        for (int i = 0; i<amount; i ++){
            System.out.println(my_str);
        }
    }

    public static boolean year(int number) {
        if ((number % 100 != 0 && number % 4==0 ) ||  number % 400 ==0 ) {
            System.out.println("Вискосный");
            return true;
        }else{
            System.out.println("Не високосный");
            return false;
        }

    }
}
