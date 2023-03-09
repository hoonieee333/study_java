class Data { int x; }
public class ReferenceReturnEx {
  public static void main(String[] args) {
    Data d1 = new Data();
    d1.x = 10;

    Data d2 = copy(d1);

    System.out.println(d1.x);
    System.out.println(d2.x);

  }
  static Data copy(Data argRef) {
    Data tmp = new Data();
    tmp.x = argRef.x;
    return tmp;
  }
}
