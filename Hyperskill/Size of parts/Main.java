import java.util.Scanner;


class Main {
    public static void updateArrayDependingOnDetector(int[] currValues, int detector) {
        if (detector == 0) {
            currValues[0]++;
        } else if (detector == 1) {
            currValues[1]++;
        } else if (detector == -1) {
            currValues[2]++;
        }
    }
    public static void main(String[] args) {
        int[] result = {0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        int parts = scanner.nextInt();
        for (int i = 0; i < parts; i++) {
            int detector = scanner.nextInt();
            updateArrayDependingOnDetector(result, detector);
        }
        System.out.println(result[0] + " " + result[1] + " " + result[2]);

    }
}
