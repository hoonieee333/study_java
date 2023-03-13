public class ReferenceParamEx2 {
  public static void main(String[] args) {
    int[] arr = {10};

    change(arr);

    System.out.println(arr[0]);
  }
  static void change(int[] argArr) {
    argArr[0] = 1000;
    System.out.println(argArr[0]);
  }
}
