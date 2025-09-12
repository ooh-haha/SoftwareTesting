import java.util.Scanner;

public class ArithmeticExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 입력 받기
        System.out.print("정수 a 입력: ");
        int a = sc.nextInt();
        System.out.print("정수 b 입력: ");
        int b = sc.nextInt();

        // 사칙연산 수행
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));

        sc.close();
    }
}
