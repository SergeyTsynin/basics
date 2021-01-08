package M3_Strings_and_basics_of_text_processing.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    private static String SENTENCE_SPLITTER = "([^.!?]+[.!?])";
    private static String PARAGRAPH_SPLITTER = "(\n)";
    private static String WORD_SPLITTER = " ";

    public static void main(String[] args) {

        String S = "Sed ut perspiciatis unde omnis iste natus. " +
                "Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit.\n" +
                "Ut enim ad minima veniam? " +
                "Quis autem vel eum. " +
                "Voluptas nulla pariatur! \n" +
                "Qui dolorem ipsum.";
//        System.out.println(S);
//        S = sortParagraphsByNumberOfSentences(S);
//        System.out.println(S);
        S = sortSentencesByWordLength(S);
        System.out.println(S);
    }

    /*
     * Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
     * операции:
     * отсортировать абзацы по количеству предложений;
     * в каждом предложении отсортировать слова по длине;
     * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
     * а в случае равенства – по алфавиту.
     */
    private static String sortParagraphsByNumberOfSentences(String S) {
        List<String> paragraphs = Arrays.asList(S.split(PARAGRAPH_SPLITTER));
        paragraphs.sort(Comparator.comparingInt(para -> numberOfParts(para, SENTENCE_SPLITTER)));
        return paragraphs.toString();
    }

    private static String sortSentencesByWordLength(String S) {
        List<String> sentences = splitOnParts(S, SENTENCE_SPLITTER);
        StringBuilder result = new StringBuilder();
        for (String sentence : sentences) {
            char endSymbol = sentence.charAt(sentence.length() - 1);
            sentence = sentence.substring(0, sentence.length() - 1).trim();
            List<String> sentenceList = Arrays.asList(sentence.split(WORD_SPLITTER));
            sentenceList.sort(Comparator.comparingInt(String::length));
            for (String word : sentenceList) {
                result.append(word).append(' ');
            }
            result.deleteCharAt(result.length() - 1).append(endSymbol).append(' ');
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }

    private static int numberOfParts(String S, String splitter) {
        int result = 0;
        Pattern pattern = Pattern.compile(splitter);
        Matcher matcher = pattern.matcher(S);
        while (matcher.find()) {
            result++;
        }
        return result;
    }

    private static List<String> splitOnParts(String S, String splitter) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(splitter);
        Matcher matcher = pattern.matcher(S);
        while (matcher.find()) {
            result.add(matcher.group());
        }
        return result;
    }

    private static String composeFromParts(List<String> parts, String divider) {
        StringBuilder result = new StringBuilder();

        return result.toString();
    }

}
