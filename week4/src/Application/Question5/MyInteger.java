package week4.src.Application.Question5;

import java.util.Objects;

public class MyInteger {
    private int i;

    // constructor
    public MyInteger(int m) {
        i = m;
    }

    public int getI() {
        return i;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof MyInteger)) return false;
//        MyInteger myInteger = (MyInteger) o;
//        return getI() == myInteger.getI();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getI());
//    }
}
