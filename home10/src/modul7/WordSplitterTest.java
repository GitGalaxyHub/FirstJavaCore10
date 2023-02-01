package modul7;

import java.util.Arrays;

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}
class WordSplitter {
    public String[] split(String phrase) {
        return phrase.toLowerCase().trim().split("\\s+");
//В данном случае метод toLowerCase() будет преобразовывать строку в нижний регистр, а затем метод trim() будет удалять пробелы в начале и конце строки и метод split("\s+") будет разбивать строку на слова используя пробелы как разделитель.
    }
}