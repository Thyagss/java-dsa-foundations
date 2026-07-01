/* 

Problem Statement: Given two integer arrays, check if they are equal or not.
Two arrays are considered equal if they have the same length and contain 
the exact same elements. 

I/P: 
a = {1, 2, 3, 4, 5}, b = {1, 2, 3, 4, 5, 6} 
O/P: false

I/P :
a = {1, 2, 3}, b = {1, 9, 3} 
O/P: false
 
 */

package arrays;

public class EqualArrays {

    public static boolean matchingArray(int[] a, int[] b) {

        if(a.length != b.length) { return false; }

        for(int i=0; i<a.length; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5,6};

        if(matchingArray(a,b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
