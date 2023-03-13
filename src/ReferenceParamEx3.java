public class ReferenceParamEx3 {
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
    for (int i = 0 ; i < argArr.length - 1 ; i++) {
      for (int j = 0 ; j < argArr.length - i - 1 ; j++) {
        if (argArr[j] > argArr[j + 1]) {
          int tmp = argArr[j + 1];
          argArr[j + 1] = argArr[j];
          argArr[j] = tmp;
        }
      }
    }
  }
}
