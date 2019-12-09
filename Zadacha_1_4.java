import java.util.Scanner;

public class Zadacha_1_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (((b>=a)&&(a>c)) || ((c>=a)&&(a>b)) || ((b==c)&&(a>b)))
            System.out.println(a); else
        if (((a>=b)&&(b>c)) || ((c>=b)&&(b>a)) || ((a==c)&&(b>c)))
            System.out.println(b); else
        if (((a>=c)&&(c>b)) || ((b>=c)&&(c>a)) || ((a==b)&&(c>a)))
            System.out.println(c); else
        if (a==c)
            System.out.println("нет второго по величине числа");
    }
}
