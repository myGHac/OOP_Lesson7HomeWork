package additional_task;

public class Main {

    public static void main(String [] args)
    {
        Vehicles bmw = Vehicles.BMW;
        Vehicles mic = Vehicles.Mitsubishi;
        Vehicles sub = Vehicles.Subaru;
        Vehicles toy = Vehicles.Toyota;

        bmw.setColor("white");
        mic.setColor("grey");
        sub.setColor("blue");
        toy.setColor("black");

  System.out.println(bmw.toString());
  System.out.println(mic.toString());
  System.out.println(sub.toString());
  System.out.println(toy.toString());

    }

}
