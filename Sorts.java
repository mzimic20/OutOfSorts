public class Sorts {

  public static void bubbleSort(int[] data) {
    int n = 0;
    int temp = 0;
    for(int i = 0; i < data.length; i++) {
      for(int j = 0; j < data.length - 1 - n; j++) {
        if (data[j] > data[j + 1]) {
          temp = data[j + 1];
          data[j + 1] = data[j];
          data[j] = temp;
        }
      }
      n++;
    }
  }

}
