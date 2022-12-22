public class RomanToInteger {

    public static void main(String[] args) {
        int i = romanToInt("II");
        System.out.println(i);
    }

    public static int romanToInt(String s) {
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int lastNumber = 0;
        for (char c : s.toCharArray()) {
            Numbers n = Numbers.valueOf(String.valueOf(c).toUpperCase());
            int currentNumber = n.getValue();
//            if (lastNumber > currentNumber) {
//                negativeNumbers -= currentNumber;
//            } else {

            positiveNumbers += currentNumber;
//            }
            lastNumber = n.getValue();
        }

        return positiveNumbers + negativeNumbers;
    }

    public enum Numbers {

        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(100),
        M(1000);

        private int value;

        Numbers(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
