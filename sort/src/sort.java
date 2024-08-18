
import java.util.Random;

class sort {
  static int SZ = 20;
  static Random rng = new Random();
  static int srcArr[] = new int[SZ];
  static int newArr[] = new int[SZ];

  public static void main(String[] args) {
    // Load the source array w/random vals
    for (int i = 0; i < SZ; i++)
      srcArr[i] = rng.nextInt(100);

    // Now do stuff
    new sort().go();
  }

  void go() {
    System.out.println("Original source array:");
    dumpArray(srcArr);
    System.out.println();

    for (int i = 0; i < SZ; i++) { 
      int cnt = howMany(srcArr, srcArr[i]);  
      int idx = howManyAreSmaller(srcArr, srcArr[i]);
      for (int j = idx; j < (idx + cnt); j++)
        newArr[j] = srcArr[i];
    }

    System.out.println("Sorted array:");
    dumpArray(newArr);
    System.out.println();
  }

  // Return the number of elements having a value less than 'val'.
  int howManyAreSmaller(int[] arr, int val) {
    int cnt = 0;
    for (int i = 0; i < SZ; i++) {
      if (arr[i] < val) cnt++;
    }
    return cnt;
  }

  // Return the number of times 'val' occurs.
  int howMany(int[] arr, int val) {
    int cnt = 0;
    for (int i = 0; i < SZ; i++) {
      if (arr[i] == val) cnt++;
    }
    return cnt;
  }

  // Dump array contents to the console.
  void dumpArray(int[] arr) {
    for (int i = 0; i < SZ; i++)
      System.out.println(i + " => " + arr[i]);
  }
}
