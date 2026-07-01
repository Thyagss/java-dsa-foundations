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
