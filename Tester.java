import java.util.Random;
import java.util.Arrays;

public class Tester {

  public static void main(String[]args){
    //args 0 must be size of the Array
    //args 1 must be "bubble", "selection", or "insertion"
    int[] randData = new int[Integer.parseInt(args[0])];
    for(int i = 0; i < randData.length; i++) {
      randData[i] = (int)(Math.random() * 10000);
    }
    int[] compare = Arrays.copyOf(randData, randData.length);
    Arrays.sort(compare);
    if (args[1].equals("bubble")) {
      Sorts.bubbleSort(randData);
      if ( Arrays.equals(randData, compare) ) System.out.println("bubbleSort success");
      else System.out.println("bubbleSort failed");
    }
    if (args[1].equals("selection")) {
      Sorts.selectionSort(randData);
      if ( Arrays.equals(randData, compare) ) System.out.println("selectionSort success");
      else System.out.println("selectionSort failed");
    }
    if (args[1].equals("insertion")) {
      Sorts.insertionSort(randData);
      if ( Arrays.equals(randData, compare) ) System.out.println("insertionSort success");
      else System.out.println("insertionSort failed");
    }
  }

}
