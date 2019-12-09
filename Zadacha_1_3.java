import java.util.Scanner;

public class Zadacha_1_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if((a==b)||(b==c)||(a==c))
            System.out.println("есть одинаковые числа");
        else System.out.println("нет одинаковых чисел");

    }
}
