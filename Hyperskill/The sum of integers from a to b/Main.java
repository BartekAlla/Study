import java.util.Scanner;

class Main {
    public static void sumOfIntegersFromAToB(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            result += i;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        sumOfIntegersFromAToB(a, b);
    }
}