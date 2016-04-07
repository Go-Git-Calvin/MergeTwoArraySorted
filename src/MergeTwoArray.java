/**
 * Created by Calvin on 4/6/16.
 *
 * A code to merge two arrays in sorted order such that if an integer is in both arrays, it only gets
 * put into a new array once.
 *
 */
public class MergeTwoArray {

    public int[] merge(int a[], int b[]) {

        int[] result = new int[a.length + b.length];
        int a_Index = 0, b_Index = 0;

        for (int i = 0; i < result.length; i++) {
            if (a_Index < a.length && b_Index < b.length) {
                if (a[a_Index] < b[b_Index]) {
                    result[i] = a[a_Index];
                    a_Index++;
                } else {
                    result[i] = b[b_Index];
                    b_Index++;
                }
            } else if (a_Index < a.length) {
                result[i] = a[a_Index];
                a_Index++;
            } else {
                result[i] = b[b_Index];
                b_Index++;
            }
        }
        return result;
    }
} // end of class


