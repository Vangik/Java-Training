package src.com.company.train;

public class Parent {
    public int f() {
        return 1;
    }

    public int useF() {
        return f();
    }
}
