package Home_Work_2._3;
public class Cat extends Animal implements Say{

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void voice() {
        if this.getFull0ffood() == 100 {
            System.out.println("Мурррр!");
        }
        else{
            System.out.println("Мяуууу!");
            int diff = this.getFull0ffood() - 30;
            if diff < 0 {
                this.setFull0ffood(0);
            }
            else{
                this.setFull0ffood(diff);
            }
        }

    }

    static void getfood(int food){
        int sum = this.getFull0ffood() + food;
        if sum > 99 {
            this.setFull0ffood(100);
                   }
        else this.setFull0ffood(sum);
        }



}
