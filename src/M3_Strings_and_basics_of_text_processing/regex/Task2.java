package M3_Strings_and_basics_of_text_processing.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String S = "<notes>\n <note id = \"1\">\n <to>Вася</to>\n <from>Света</from>\n <heading>Напоминание</heading>\n " +
                "<body>Позвони мне завтра!</body>\n </note>\n <note id = \"2\">\n <to>Петя</to>\n <from>Маша</from>\n " +
                "<heading>Важное напоминание</heading>\n <body/>\n </note>\n</notes>";
        analyzer(S);
    }

    /*
     * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
     * тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
     * нельзя.
     */
    private static void analyzer(String S) {
        Pattern tag = Pattern.compile("(?<=>)");
        Pattern closeTag = Pattern.compile("(^</)");
        Pattern noBodyTag = Pattern.compile("($?/>)");
        String[] words = S.split("(?<=>)|(?=<)");

        for (String word : words) {
            Matcher tagMatcher = tag.matcher(word);
            Matcher closeMatcher = closeTag.matcher(word);
            Matcher noBodyMatcher = noBodyTag.matcher(word);
            if (tagMatcher.find()) {
                if (closeMatcher.find()) {
                    System.out.println(word + " - закрывающий тег");
                } else if (noBodyMatcher.find()) {
                    System.out.println(word + " - тег без тела");
                } else {
                    System.out.println(word + " - открывающий тег");
                }
            } else if (word.trim().length() > 0) {
                System.out.println(word + " - содержимое тега");
            }
        }
    }
}
