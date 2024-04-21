public class Main {

    public static boolean isVowel(char c) {
        String vowels = "aeiou";
        return vowels.indexOf(c) != -1;
    }
    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                vowelsCount++;
            } else {
                continue;
            }
        }
        return vowelsCount;
    }

    public static void main(String[] args) {

        System.out.println(getCount("abracadabra"));

    }
}