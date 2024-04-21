
class Main {
    public static String toJadenCase(String phrase) {

        if (phrase != null && !phrase.isEmpty()) {


            String[] words = phrase.split(" ");

            for (int i = 0; i < words.length; i++) {

                String firstLetter = words[i].substring(0, 1);
                String restOfWord = words[i].substring(1);
                firstLetter = firstLetter.toUpperCase();
                words[i] = firstLetter + restOfWord;
            }

            return String.join(" ", words);
        }

        return null;
    }

    public static void main(String[] args) {
        String result = toJadenCase("most trees are blue");
        System.out.println(toJadenCase(result));
    }
}
