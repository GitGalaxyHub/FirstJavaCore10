package modul7;

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}
class PunctuationMarkCounter {
    public int count(String phrase) {
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (c == '.' || c == ',' || c == '!' || c == ':' || c == ';') {
                count++;
            }
        }
        return count;
    }
}
//Note that this implementation counts all punctuation marks regardless of their context, so it might not work correctly in all cases. For example, if a sentence contains a number written with a dot as a decimal separator, it will be counted as a punctuation mark, but it should not.