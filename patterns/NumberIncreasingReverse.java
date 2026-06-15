/*

Sample Output :

12345
1234
123
12
1

*/

package patterns;

import java.util.Scanner;

public class NumberIncreasingReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        for(int i=1; i<=input; i++) // i=1 input = 5 j=1 j<5-1
        {
            for(int j=1; j<=(input+1)-i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}