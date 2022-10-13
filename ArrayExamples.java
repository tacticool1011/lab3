import java.util.*;
public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int temp;
    for(int i = 0; i < arr.length / 2; i += 1) {
      temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = arr.length - 1, j = 0; i >= 0 && j < arr.length; i--, j++) {
      newArray[j] = arr[i];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    int counter = 0;
    for(double num: arr) {
      if(num != lowest || counter > 0) { 
        sum += num;
      }
      if(num == lowest){
        counter++;
      }//bug is that it gets rid of all of the lowest
    }
    System.out.println((sum));
    return sum / (arr.length - 1);
  }
}

