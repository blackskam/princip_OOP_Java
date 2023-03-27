package Home_Work_2._3;

public class Human extends Mammal implements Say{

    public Human(String name, int age){
        super(name, age);
    }
    public Human(String name){
        super(name, 0);
    }

    @Override
    public void voice() {
        System.out.println("Кис кис");
    }
}
