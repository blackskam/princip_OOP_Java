package Home_Work_2._3;
public class Cat extends Animal implements Say{

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }
}
