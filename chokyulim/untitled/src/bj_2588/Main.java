package bj_2588;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(n1 * (n2 % 10));
        System.out.println(n1 * (n2 % 100 / 10));
        System.out.println(n1 * (n2 / 100));
        System.out.println(n1 * n2);
        sc.close();
    }
}
