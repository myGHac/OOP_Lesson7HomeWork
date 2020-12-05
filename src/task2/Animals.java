package task2;

public enum Animals {

    CAT, DOG, GIRAFFE, CAW, LYNX;

   private int age;
    Animals() {
    }
     Animals(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Genus: " + this.name() + ", age: " + age;
    }
}

