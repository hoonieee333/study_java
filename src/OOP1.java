public class OOP1 {
  public static void main(String[] args) {
    int[] arr = new int[] {3, 2, 1, 6, 5, 4};

    printArr(arr);
    sortArr(arr);
    printArr(arr);

    }
  static void printArr(int[] argArr) {
    for (int i : argArr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
  static void sortArr(int[] argArr) {
    // bubble sorting.
    for (int j = 0 ; j < argArr.length - 1 ; j++) {
      for (int k = 0 ; k < argArr.length - 1 - j; k++) {
        if (argArr[k] > argArr[k + 1]) {
          int tmp = argArr[k + 1];
          argArr[k + 1] = argArr[k];
          argArr[k] = tmp;
        }
      }
    }
  }

}