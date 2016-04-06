/**
 * Created by Calvin on 4/6/16.
 *
 * A code to merge two arrays in sorted order such that if an integer is in both arrays, it only gets
 * put into a new array once.
 *
 */
public class MergeTwoArray {

    // method to merge two int array
    public int[] merge(int a[], int b[]) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0, bIndex = 0;

        for (int i = 0; i < result.length; i++) {
            if (aIndex < a.length && bIndex < b.length) {
                if (a[aIndex] < b[bIndex]) {
                    result[i] = a[aIndex];
                    aIndex++;
                } else {
                    result[i] = b[bIndex];
                    bIndex++;
                }
            } else if (aIndex < a.length) {
                result[i] = a[aIndex];
                aIndex++;
            } else {
                result[i] = b[bIndex];
                bIndex++;
            }
        }
        return result;
    }
} // end of class


