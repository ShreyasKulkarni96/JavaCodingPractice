package ArrayProblems;

/* To find the frequency of elements in an array.
 * 1st we will initalize an array.
 * To store the repeated elements frequency we need to create another array. 
 * To mark the visited elements while in loop we need to have one flag.
 * We need to count elements so another flag to count elements.
 */

public class FrequencyOfElement {
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,5,6,2,2,3,1,1,5};
        
        int [] arr_fr = new int [arr.length];

        int visited = -1;

        for(int i =  0; i< arr.length; i++) {
            int count = 1;
            for(int j = i+1; j<arr.length; j++) {
                 if (arr[i] == arr[j]) {
                    count ++;
                    arr_fr[j] = visited;
                 }
            }

            if (arr_fr[i] != visited) {
                arr_fr[i] = count;
            }
        }

        for (int i = 0; i< arr_fr.length; i++) {
            if(arr_fr[i] != visited)
            System.out.println(arr[i] + "|" + arr_fr[i] );
        }
    }
}
