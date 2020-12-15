public class Sorts {

  public static void bubbleSort(int[] data) {
    int n = 0;
    int temp = 0;
    for(int i = 0; i < data.length; i++) {
      for(int j = 1; j < data.length - n; j++) {
        if (data[j - 1] > data[j]) {
          temp = data[j];
          data[j] = data[j - 1];
          data[j - 1] = temp;
        }
      }
      n++;
    }
  }

}
