package Hashmap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

    public class FrequencyOfWords {

        HashMap<String, Integer> MyMapNode = new HashMap<>();
        private String[] sentenceSplit;

        public static void main(String[] args) {
            FrequencyOfWords frequencyObj = new FrequencyOfWords();
            frequencyObj.splitString();
            frequencyObj.countWords();
        }

        public void splitString() {
            System.out.println("Enter the sentence to check frequency of words : ");
            Scanner scanner = new Scanner(System.in);
            String sentence = scanner.nextLine();
            String line = sentence.toLowerCase(Locale.ROOT);
            sentenceSplit = line.split(" ");
        }
        public void countWords() {
            for (String word : sentenceSplit) {
                if (MyMapNode.containsKey(word)) {
                    MyMapNode.put(word, MyMapNode.get(word) + 1);
                } else {
                    MyMapNode.put(word, 1);
                }
            }
            for (Map.Entry<String, Integer> entry : MyMapNode.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

