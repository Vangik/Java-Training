package src.com.company;

public class B extends A {
    public double i = 1.1;


    @Override
    public void m1() {
        System.out.println("Class B, method m1 i= " + i);
    }
    @Override
    public void m4() {
        System.out.println("Class B, method m4");
    }
//   B(){
//       super();
//       System.out.println(getI());
//   }
//   public void setJ(int j){
//       this.j=j;
//   }


}
