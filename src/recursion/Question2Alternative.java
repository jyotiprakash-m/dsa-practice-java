package recursion;

public class Question2Alternative {
    static String[] numbers = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void convertnumberToString(int num) {
        if (num == 0)
            return;
        convertnumberToString(num / 10);
        System.out.print(numbers[(num % 10)] + " ");
    }

    public static void main(String[] args) {
            convertnumberToString(1947);
    }
}
