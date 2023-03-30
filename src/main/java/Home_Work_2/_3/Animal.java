package Home_Work_2._3;


import java.util.Random;

public class Animal extends Mammal{
    private String color;
    Random r = new Random();
    private  int full0ffood;

    public Animal(String name, int age,String color){
        super(name, age);
        this.color = color;
        happy = r.nextInt(1,100);
        full0ffood = r.nextInt(1,100);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFull0ffood() {
        return full0ffood;
    }

    public void setFull0ffood(int full0ffood) {
        this.full0ffood = full0ffood;
    }


}

