public class RomanToInteger {

    public static void main(String[] args) {
        int i = romanToInt("MCMXCIV");
        System.out.println(i);
    }

    public static int romanToInt(String s) {
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int lastNumber = 0;
        for (char c : s.toCharArray()) {
            Numbers n = Numbers.valueOf(String.valueOf(c).toUpperCase());
            int currentNumber = n.getValue();
            int subtractNumber = n.getSubtractNumber();
            positiveNumbers += currentNumber;
            if (lastNumber == subtractNumber && lastNumber != 0) {
                positiveNumbers -= currentNumber + lastNumber;
                negativeNumbers -= subtractNumber;
                positiveNumbers += currentNumber;
            }
            lastNumber = n.getValue();
        }

        return positiveNumbers + negativeNumbers;
    }

    public enum Numbers {

        I(1, 0),
        V(5, 1),
        X(10, 1),
        L(50, 10),
        C(100, 10),
        D(500, 100),
        M(1000, 100);

        private int value;

        private int subtractNumber;

        Numbers(int value, int subtractNumber) {
            this.value = value;
            this.subtractNumber = subtractNumber;
        }

        public int getValue() {
            return value;
        }

        public int getSubtractNumber() {
            return subtractNumber;
        }
    }
}
