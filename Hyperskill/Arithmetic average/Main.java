import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static boolean isDivisibleBy3(Integer number) {
        return number % 3 == 0;
    }

    public static ArrayList<Integer> makeArrayFromNumbers(int a, int b) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            numbers.add(i);
        }
        return numbers;
    }
    public static int[] getSumOfNumbersDivisibleBy3(ArrayList<Integer> numbers) {
        int sum = 0;
        int count = 0;
        int[] result = new int[2];
        for (int i  = 0; i < numbers.size(); i ++) {
            if (isDivisibleBy3(numbers.get(i))) {
                sum += numbers.get(i);
                count++;
            }
        }
        result[0] = sum;
        result[1] = count;
        return result;
    }

    public static double average(ArrayList<Integer> numbers) {
        return (double) getSumOfNumbersDivisibleBy3(numbers)[0]/getSumOfNumbersDivisibleBy3(numbers)[1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(average(makeArrayFromNumbers(a, b)));
    }
}