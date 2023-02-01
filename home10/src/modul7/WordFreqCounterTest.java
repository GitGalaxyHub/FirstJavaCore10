package modul7;

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}
class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        word = word.toLowerCase();
        phrase = phrase.toLowerCase();
        String[] words = phrase.split(" ");
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return (float)count/words.length;
    }
}