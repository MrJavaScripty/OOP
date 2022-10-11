package Application.Question2;

import Domain.Question.Question;

public class Question2 implements Question {
    @Override
    public void run() {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";

        // With Concat
        String sentence = animal1.concat(action).concat(article).concat(animal2);
        System.out.println("==== Sentence with String.concat ====");
        System.out.println(sentence);

        // With String Buffer
        StringBuffer sentenceWithBuffer = new StringBuffer(animal1);
        sentenceWithBuffer.append(action).append(article).append(animal2);
        System.out.println("==== Sentence with String Buffer ====");
        System.out.println(sentenceWithBuffer);

        // With String Builder
        // Refer https://stackoverflow.com/questions/4645020/when-to-use-stringbuilder-in-java
        StringBuilder sentenceWithBuilder = new StringBuilder(animal1);
        sentenceWithBuilder.append(action).append(article).append(animal2);
        System.out.println("==== Sentence with String Builder ====");
        System.out.println(sentenceWithBuilder);
    }
}
