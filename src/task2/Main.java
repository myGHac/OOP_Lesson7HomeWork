package task2;

public class Main {

    public static void main(String [] args) {

        Animals cow = Animals.CAW;
        Animals cat = Animals.CAT;
        Animals dog = Animals.DOG;
        Animals giraffe = Animals.GIRAFFE;
        Animals lynx = Animals.LYNX;

        cow.setAge(5);
        cat.setAge(2);
        dog.setAge(7);
        giraffe.setAge(12);
        lynx.setAge(4);

        System.out.println(cow.toString());
        System.out.println(cat.toString());
        System.out.println(dog.toString());
        System.out.println(lynx.toString());
        System.out.println(giraffe.toString());




    }
}


