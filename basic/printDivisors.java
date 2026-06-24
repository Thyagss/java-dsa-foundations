package basic;

import java.util.ArrayList;
import java.util.List;

public class printDivisors {

    public static List<Integer> divisors(int n) {

        List<Integer> result = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int n = 36;

        List<Integer> result = printDivisors.divisors(n);
        
        for(int values : result) {
            System.out.print(values + " ");
        }
        System.out.println();
    }
}
