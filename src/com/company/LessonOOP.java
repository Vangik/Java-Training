package src.com.company;

public class LessonOOP extends AA implements BB {

    LessonOOP(){
        super("taras");
    }

    public void move() {
        System.out.println("Start moving");
        System.out.println(startEngine(1));
    }

    public double countStarts(){
        return startEngine(1);
    }

    public void stop() {
        System.out.println("Stop moving");

    }

}
