import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        getLotteryNumbers();
    }

    private static void getEvenNumbersUsingFor(){
        for (int i = 2; i < 100; i+=2) {
            System.out.println(i);
        }
    }

    private static void getEvenNumbersUsingWhile() {
        int counter = 2;

        while(counter < 100) {
            System.out.println(counter);
            counter += 2;
        }
    }

    /*
        Notice that we use a reference type of `Integer` instead of the
        primitive `int`.

        This is because in line 44, we make use of Lists via the "Arrays.asList"
        function. In Java, Lists require a reference type in order make use of
        a concept known as "AutoBoxing"

        Read more about AutoBoxing here
        https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
    */
    private static void getLotteryNumbers() {
        Integer[] lotteryNumbers = new Integer[6];

        for (int index = 0; index < lotteryNumbers.length; index++) {
            boolean hasNumber;

            do {
                Random randomizer = new Random();
                int newNumber = randomizer.nextInt(2, 49);
                hasNumber = Arrays.asList(lotteryNumbers).contains(newNumber);

                if (!hasNumber){
                    lotteryNumbers[index] = newNumber;
                }
            } while(hasNumber);
        }

        System.out.println("Your lottery numbers are " + Arrays.toString(lotteryNumbers));
    }
}