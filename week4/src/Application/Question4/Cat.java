package week4.src.Application.Question4;

public class Cat {
    private String colour;

    public Cat(String colour1) {
        colour = colour1;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour1) {
        colour = colour1;
    }

    /**
     *  creates a new Question4.Cat object and returns it to the caller
     */
    public Cat create() {
        Cat c = new Cat("Brown");
        System.out.println("\nInside Question4.Cat.create(), address of created " +
                " cat object c is: " + c);
        return c;
    }
}
