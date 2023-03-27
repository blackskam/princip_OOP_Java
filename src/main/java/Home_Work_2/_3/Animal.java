package Home_Work_2._3;



public abstract class Animal extends Mammal{
    private String color;

    public Animal(String name, int age,String color){
        super(name, age);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

