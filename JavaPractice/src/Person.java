import java.io.Serializable;

public class Person implements Serializable {//implements Info{
    private int id;
    private String name;
    public Person(int id, String name){
        this.id = id;
        this.name = name;

    }

    public void greet(){
        System.out.println("Hello there " + name);

    }

//    @Override
    public void showInfo() {
        System.out.println("I am a Person");
    }

    public String toString(){
        return "Person [id=" +id + ", name=" + name + "]";
    }


}
