package lecture;

public class Parent {
    public void parentFirstMsg(){
        this.parentSecondMsg();
        System.out.println("First output in Parent First method!");
    }
    public void parentSecondMsg(){
        System.out.println("Second output from parent this.method");
    }
}

