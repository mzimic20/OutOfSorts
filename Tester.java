import java.util.Random;
import java.util.Arrays;

public class Tester {

  public static void main(String[]args) {
    int[] a = new int[10000];
    int seed = Integer.parseInt( args[0] );
    Random rng = new Random(seed);
    for(int i = 0; i < 10000; i++) {
      a[i] = rng.nextInt() % 1000;
    }
    int[] comp = a;
//    System.out.println("inital array: " + Arrays.toString(a) );

    Sorts.bubbleSort(a);

//    System.out.println( Arrays.toString(a) );

    Arrays.sort(comp);

    boolean failure = false;
    int instance = 0;
    for(int i = 0; i < comp.length; i++) {
      if (a[i] != comp[i]) {
        failure = true;
        instance = i;
      }
    }
    if (failure) System.out.println("Error! Elements at index " + instance + "unequal.");
    else System.out.println("Success!");
  }

}
