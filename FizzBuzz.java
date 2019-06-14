public class FizzBuzz {
    public String fizzBuzz(int num) {
        // if num div 3 (and not 5)
        if (num % 3 == 0 && !(num % 5 == 0)) {
            return "Fizz";
        // if num div 5 (and not 3)
        } else if (num % 5 == 0 && !(num % 3 == 0)) {
            return "Buzz";
        // if num div 3 & 5
        } else if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        // else cast as string.
        } else {
            return Integer.toString(num);
        }
    }
}