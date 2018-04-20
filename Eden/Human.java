package Eden;

public class Human {
    private String name;
    private boolean gender;
    private int age;

    public Human() {
    }

    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void say(String words) {
        System.out.println(words);
    }

    public void eat(Apple food) {
        food.weight--;
    }

    public void sleep() {
        System.out.println("zzz...ZZZ..Sleep");
    }

    public String getName() {
        return name;
    }

    public void getName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
