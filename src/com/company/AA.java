package src.com.company;

public abstract class AA {
    private String name;

     AA(String name){
         this.name=name;
         System.out.println(this.name);
     }

    public String getName() {
        return name;
    }

    abstract public void stop();

}
