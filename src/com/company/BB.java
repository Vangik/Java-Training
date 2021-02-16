package src.com.company;

public interface BB {
    void move();

    default double startEngine(int i) {
       return i * i;
    }
}
