package Application.Question3;

import Domain.Question.Question;

import java.awt.Rectangle;

public class Question3 implements Question {
    @Override
    public void run() {
        Rectangle r1 = new Rectangle(0, 0, 100, 50);
        Rectangle r2 = new Rectangle(r1);
        r2.grow(10,20);
        System.out.println(r1);
        System.out.println(r2);
    }

    public void run_2(){
        Rectangle r1 = new Rectangle(0, 0, 100, 50);
        Rectangle r2 = r1;
        r2.grow(10,20);
        System.out.println(r1);
        System.out.println(r2);
    }

    public void run_3(){
        double n1 = 150;
        double n2 = n1;

        n2 = n2 * 20; // grow n2

        System.out.println(n1);
        System.out.println(n2);
    }
}
