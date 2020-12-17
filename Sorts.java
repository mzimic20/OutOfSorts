public class Sorts {

  public static void bubbleSort(int[] data) {
    int n = 0;
    int temp = 0;
    for(int i = 0; i < data.length; i++) {
      for(int j = 0; j < data.length - 1 - n; j++) {
        if ( data[j] > data[j + 1] ) {
          temp = data[j + 1];
          data[j + 1] = data[j];
          data[j] = temp;
        }
      }
      n++;
    }
  }

  public static void selectionSort(int[] data) {
    int n = 0;
    int temp = 0;
    for(int i = 0; i < data.length; i++) {
      for(int j = n; j < data.length; j++) {
        if ( data[j] < data[n] ) {
          temp = data[n];
          data[n] = data[j];
          data[j] = temp;
        }
      }
      n++;
    }
  }

  public static void insertionSort(int[] data) {
    int n = 0;
    int j = 0;
    for(int i = 1; i < data.length; i++) {
      n = data[i];
      j = i - 1;
      while(j >= 0 && n < data[j]) {
        data[j + 1] = data[j];
        j--;
      }
      data[j + 1] = n;
    }
  }

}
