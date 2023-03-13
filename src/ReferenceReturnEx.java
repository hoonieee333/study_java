class DataD { int x; }

public class ReferenceReturnEx {
  public static void main(String[] args) {
    DataD d = new DataD();
    d.x = 10;

    DataD d2 = copy(d);
    System.out.println(d2.x);
  }
  static DataD copy(DataD argAddr) {
    DataD tmp = new DataD();
    tmp.x = argAddr.x;
    return tmp;
  }
}