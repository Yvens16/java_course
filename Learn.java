import java.util.ArrayList;

public class Learn {
  public static void main(String[] args) {
    Ville ville1 = new Ville("Paris", 3000);
    Ville ville2 = new Ville("Marseille", 2000);
    Ville ville3 = new Ville("Clichy", 500);
    Ville[] cities = {ville1, ville2, ville3};
    Capitale c1 = new Capitale("Bruxelles", 4000);
    Pig pepa = new Pig();
    Wolf lop = new Wolf();
    pepa.sound();
    lop.animSound();
    // System.out.println(c1.getA());
    // for(int i = 0; i < cities.length; i++) {
    //   System.out.println(cities[i].name);
    // }
    // ArrayList<Ville> cities2 = new ArrayList<Ville>();
    // cities2.add(ville1);
    // cities2.add(ville2);
    // cities2.add(ville3);
    // cities2.forEach(c -> System.out.println(c.number));
    // int tab[] = {1,2,3};
    // for(int n: tab) {
    //   System.out.println(n);
    // };
  }

  public static class Ville {
    String name;
    int number;

    public Ville (String pName, int pNumber) {
      name = pName;
      number = pNumber;
    }

    public String getA() {
      return "Maud";
    }
  }

  public static class Capitale extends Ville {
    public Capitale(String pName, int pNumber) {
      super(pName, pNumber);
    }

    public String getName() {
      return super.getA();
    }
    public String getA() {
      //polymorphisme le fait de recréer la méthode pour pas que ce soit la méthode de la classe mère qui soit appeler 
      return "Yvens";
    }
  }

  abstract static class Animal {
    public abstract void sound();
  }

  public static class Pig extends Animal{
    public void sound() {
      System.out.println("bouhhhhhh");
    }
  }

  interface Animal2 {
    public void animSound();
  }

  public static class Wolf implements Animal2 {
    public void animSound() {
      System.out.println("Wolf wolf");
    }
  }


}