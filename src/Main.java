import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(day(17, 30));
        System.out.println(day(25, 0));
        System.out.println(day(18, -20));
        System.out.println(day(65, -35));
        System.out.println(day(34, 23));


    }

    public static String day(int age, int temperature) {
        if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30))
            return "Можно идти гулять";
        else if (age > 20 && (temperature > 0 && temperature < 28))
            return "Можно идти гулять";
        else if (age < 45 && (temperature > -10 && temperature < 25))
            return "Можно идти гулять ";
        else
            return "Оставайтесь дома";
    }}











