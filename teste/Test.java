package teste;
public class Test {
  public static void print(Object param) { // Object agit comme un type (any: veut dire peu importe le type de param)
    System.out.println(param);
  }
  int count = 10;
  static int staticCount1 = 2;
  public void x() {
    print("Hello test");
    print(count);
  }
}
