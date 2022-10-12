package Application.Question5;

import Domain.Question.Question;

import java.util.Arrays;
import java.util.Random;

public class Question5 implements Question {
    @Override
    public void run() {
        int numberOfCycles = 10000;
        int total = 0;

        for (int i = 0; i <= numberOfCycles; i++) {
         int numberOfPeople = generateDataSet();
            total = total + numberOfPeople;
        }

        System.out.println(total/numberOfCycles);
    }

    private static int generateDataSet() {
        boolean[] days = new boolean[365];

        int numberOfPeople = 0;
        Random randomizer = new Random();

        while(true){
            int birthDay = randomizer.nextInt(1, 365);
            ++numberOfPeople;

            if (days[birthDay]){
                break;
            }
            days[birthDay] = true;
        }

        return numberOfPeople;
    }
}
