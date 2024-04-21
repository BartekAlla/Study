public class Main {

    public static int GetSum(int a, int b) {
        int result = 0;
        if (a != b) {
            if (a < b) {
                for (int i = a; i <= b; i++) {
                    result += i;
                }
            } else {
                for (int i = b; i <= a; i++) {
                    result += i;
                }
            }
        } else {
            result = a;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(GetSum(0, -1));
    }
}