package Application.Question3;

import Domain.Question.Question;

import java.awt.Rectangle;

public class Question3 implements Question {
    @Override
    public void run() {
        Rectangle r1 = new Rectangle(0, 0, 100, 50);
        System.out.println(r1);
    }
}
