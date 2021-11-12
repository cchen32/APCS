import java.util.Random;
public class Loopier {
//   public static int[] randomArray(int size) {
//     Random random = new Random();
//     int[] a = new int[size];
//     for (int i = 0; i < a.length; i++) {
//         a[i] = random.nextInt(100);
//     }
//     return a;
//   }
//   public static void printArray(int[] a) {
//     int i = 0;
//     while (i < 4) {
//       System.out.println(abstract [i]);
//       i++;
//     }
//   }
//   public static void main(String[] args) {
//     int[] array = randomArray(8);
//     System.out.println();
//   }

  public static void populateArray ( int[] a ) {
    Random random = new Random;
    for ( int i = 0; i < a.length; i+= 1 ) {
      a[i] = random.nextInt(100);
    }
  }

}
