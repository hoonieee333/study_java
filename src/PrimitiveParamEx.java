class DataA { int x; }

public class PrimitiveParamEx {
  public static void main(String[] args) {
    DataA obj = new DataA();

    obj.x = 10;

    change(obj.x);

    System.out.println(obj.x);

  }
  static void change(int argX) {
    argX = 1000;
    System.out.println(argX);
  }
}
