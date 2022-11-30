package week4.src.Application.Question5;

public class ObjectComparisonTest {
    public static void main(String[] args) {
        String g1 = "cat";
        String g2 = "cat";

        if (g1 == g2)
            System.out.println("g1 == g2 evaluates: true");
        else
            System.out.println("g1 == g2 evaluates: false");

        if (g1.equals(g2))
            System.out.println("g1.equals(g2) evaluates: true");
        else
            System.out.println("g1.equals(g2) evaluates: false");
        System.out.println(); // print an extra newline

        String h1 = new String("cat");
        String h2 = new String("cat");

        if (h1 == h2)
            System.out.println("h1 == h2 evaluates: true");
        else
            System.out.println("h1 == h2 evaluates: false");

        if (h1.equals(h2))
            System.out.println("h1.equals(h2) evaluates: true");
        else
            System.out.println("h1.equals(h2) evaluates: false");
        System.out.println(); // print an extra newline

        if (g1 == h1)
            System.out.println("g1 == h1 evaluates: true");
        else
            System.out.println("g1 == h1 evaluates: false");
        if (g1.equals(h1))
            System.out.println("g1.equals(h1) evaluates: true");
        else
            System.out.println("g1.equals(h1) evaluates: false");
        System.out.println(); // print an extra newline

        MyInteger m1 = new MyInteger(5);
        MyInteger m2 = new MyInteger(5);
        if (m1 == m2)
            System.out.println("m1 == m2 evaluates: true");
        else
            System.out.println("m1 == m2 evaluates: false");
        if (m1.equals(m2))
            System.out.println("m1.equals(m2) evaluates: true");
        else
            System.out.println("m1.equals(m2) evaluates: false");
    }
}
