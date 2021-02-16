package src.com.company;

public class A {
    private int i = 1;

    public void m1() {
        System.out.println("Class A, method m1 i= " + i);
    }

    public void m2() {
        System.out.println("Class A, method m2 i= " + i);
    }

    public void m3() {
        System.out.println("Class A, method m3 running m4" );
        m4();
    }

    public void m4() {
        System.out.println("Class A, method m4");
    }


//    A(){
//        this.i=5;
//        System.out.println("i= "+ i);
//    }
//
//    public void setI(int i){
//        this.i = i;
//    }
//
//    public int getI(){
//        return this.i;
//    }

}
