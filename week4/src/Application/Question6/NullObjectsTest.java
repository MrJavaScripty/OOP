package week4.src.Application.Question6;

public class NullObjectsTest {
    public static void main(String[] args) {
        String s = null;
        try {
            s.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("Null Value");
        }
    }
}
