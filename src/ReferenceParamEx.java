class DataB { int x; }

public class ReferenceParamEx {
  public static void main(String[] args) {
    DataB obj = new DataB();

    obj.x = 10;

    change(obj);

    System.out.println(obj.x);
  }
  static void change(DataB argAddr) {
    argAddr.x = 1000;
    System.out.println(argAddr.x);
  }
}
