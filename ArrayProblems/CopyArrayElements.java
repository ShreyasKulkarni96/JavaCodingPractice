package ArrayProblems;


/* To copy elements from one array into another array
 * 1. we need to initalize an array with elements.
 * 2. we need to create an array of same length of 1st array.
 * 3. we need to iterate the first array and copy the elements in second array.
 */

class CopyArrayElements {
 public static void main(String[] args) {

    // 1st array with the elements
    int [] arr1 = new int[] {1,2,6,4,5};

    // 2nd array of the same size of arr1
    int [] arr2 = new int[arr1.length];

    // To iterate through all the elements of arr1 and add to arr2
    for(int i = 0 ; i < arr1.length; i++){
      arr2[i] = arr1[i];
    }
    
    //print arr2
    for (int i=0; i< arr2.length; i++) {
        System.out.println(arr2[i]);
    }
 }
  
}

//import java.util.Arrays;

// public class CopyArrayElements {
// public static void main (String [] args) {
//     int [] arr1 = new int[] {1,2,4,5,6};
//     int [] aar2 = Arrays.copyOf(arr1, arr1.length);

//     for (int value: arr2) {
//         System.out.println(value);
//     }
// }
// }