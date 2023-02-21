import java.util.*;

public class SimilarWordsCount {
    public void getWordsCount(String searchWord, String list) {

        String[] arr = new String[]{"velo", "low", "vole", "lovee", "volvell", "lowly", "lower", "lover", "levo", "loved", "love",
                "lovee", "lowe", "lowes", "lovey", "lowan", "lowa", "evolve", "loves", "volvelle", "lowed", "love"};
        String s = "love";
        // Scanner sc = new Scanner(System.in);

        String w = s; // sc.nextLine(); //searchWord;
        String[] listWords = arr; //sc.nextLine();
        List<String> l = Arrays.asList(listWords); //list

        Set<Character> wChars = new HashSet<>();
        for (char c : w.toCharArray()) {
            wChars.add(c);
        }

        int count = 0;
        for (String word : l) {
            //if (word.length() == w.length()) {
                Set<Character> wordChars = new HashSet<>();
                for (char c : word.toCharArray()) {
                    wordChars.add(c);
                }
                if (wordChars.containsAll(wChars)) {
                    count++;
                }
            //}
        }

        System.out.println("Similar words count: " + count);
    }
}
