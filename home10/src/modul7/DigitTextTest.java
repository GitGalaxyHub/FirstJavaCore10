package modul7;

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}
class DigitText {
    public boolean detect(String text) {
        for (char c : text.toCharArray()) {
            if (!Character.isDigit(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }
}

