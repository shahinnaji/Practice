/**
 * Created by shahinnaji on 6/27/16.
 */
public class Check {

    static String[] ones =
        {"Zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String writeCheck(int number) {

        if (number < 0) {
            return "minus " + writeCheck(-number);
        }

        if (number < 20) {
            return ones[number];
        }

        if (number < 100) {
            return tens[number / 10] + " " + ones[number % 10];
        }

        if (number < 1000) {
            return ones[number / 100] + " hundred " + writeCheck(number % 100);
        }

        if (number < 10000) {
            return ones[number / 1000] + " thowsand " + writeCheck(number % 1000);
        }

        if (number < 100000) {
            return ones[number / 1000] + " thowsand " + writeCheck(number % 1000);
        }

        if (number < 1000000) {
            return writeCheck(number / 1000) + " thowsand " + writeCheck(number % 1000);
        }

        return "not implemented yet!";

    }

    public static void main(String[] arg) {
        System.out.println(writeCheck(123245));
    }

}
